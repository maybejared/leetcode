// 981. Time Based Key Value Store — Medium
// https://leetcode.com/problems/time-based-key-value-store/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0981

import practice.*

class TimeMap {
    fun set(key: String, value: String, timestamp: Int): Unit {
        TODO("Implement set")
    }

    fun get(key: String, timestamp: Int): String {
        TODO("Implement get")
    }
}

fun main() {
    runTests(
        "timestamps" to {
            val s = TimeMap(); s.set("x", "old", 2); s.set("x", "new", 7); expect("", s.get("x", 1)); expect("old", s.get("x", 2)); expect("old", s.get("x", 6)); expect("new", s.get("x", 20))
        },
        "missing key" to {
            expect("", TimeMap().get("missing", 5))
        },
        "independent keys" to {
            val s = TimeMap(); s.set("a", "one", 1); s.set("b", "two", 2); expect("one", s.get("a", 9)); expect("two", s.get("b", 9))
        },
    )
}
