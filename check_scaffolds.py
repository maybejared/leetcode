"""Compile all exercises, check helpers, and run each suite; TODOs are expected."""
import concurrent.futures
import json
import os
from pathlib import Path
import re
import subprocess
import tempfile

root = Path(__file__).resolve().parent
catalog = json.loads((root / "catalog.json").read_text())
assert len(catalog) == 150 and len({p["number"] for p in catalog}) == 150
sources = [root / p["file"] for p in catalog]
assert all(p.is_file() for p in sources)
assert set(sources) == {p for p in root.rglob("*.kt") if p.parent.name != "support"}
env = dict(os.environ)
env["JAVA_HOME"] = subprocess.check_output(["/usr/libexec/java_home", "-v", "21"], text=True).strip()
java = str(Path(env["JAVA_HOME"]) / "bin/java")
with tempfile.TemporaryDirectory(prefix="neetcode-check-") as directory:
    jar = Path(directory) / "checks.jar"
    print("Compiling 150 exercises and shared test helpers...", flush=True)
    result = subprocess.run(["kotlinc", *map(str, sources), *map(str, (root / "support").glob("*.kt")), "-jvm-target", "21", "-include-runtime", "-d", str(jar)], env=env, text=True, capture_output=True, timeout=180)
    assert result.returncode == 0, result.stderr
    subprocess.run([java, "-cp", str(jar), "practice.checks.SupportChecksKt"], check=True, timeout=20)
    def check_problem(p):
        try:
            result = subprocess.run([java, "-cp", str(jar), p["main"]], capture_output=True, text=True, timeout=15)
        except subprocess.TimeoutExpired:
            return p, None, "Timed out after 15 seconds"
        summaries = re.findall(r"^(\d+) passed, (\d+) failed, (\d+) TODO$", result.stdout, re.M)
        if len(summaries) != 1:
            return p, None, result.stdout + result.stderr
        passed, failed, pending = map(int, summaries[0])
        good = failed == 0 and passed + pending == p["tests"] and (result.returncode == 0) == (pending == 0)
        return p, (passed, failed, pending), None if good else result.stdout + result.stderr
    with concurrent.futures.ThreadPoolExecutor(max_workers=4) as pool:
        results = list(pool.map(check_problem, catalog))
    errors = [(p, error) for p, _, error in results if error]
    for p, error in errors:
        print(f'FAIL {p["number"]}. {p["title"]}\n{error}')
    assert not errors, f"{len(errors)} exercise suites failed"
    passed = sum(counts[0] for _, counts, _ in results)
    pending = sum(counts[2] for _, counts, _ in results)
    print(f"150/150 compile and execute. {passed} passing tests; {pending} TODO tests (expected for unsolved skeletons).")
