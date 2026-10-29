package practice

import java.util.Collections
import java.util.IdentityHashMap
import kotlin.math.abs
import kotlin.math.max

// Shared test plumbing only; no exercise solutions live here.
fun runTests(vararg cases: Pair<String, () -> Unit>) {
    var passed = 0
    var failed = 0
    var pending = 0
    for ((name, test) in cases) {
        try {
            test()
            passed++
            println("PASS $name")
        } catch (e: NotImplementedError) {
            pending++
            println("TODO $name: ${e.message}")
        } catch (e: Throwable) {
            failed++
            println("FAIL $name: ${e.message ?: e.javaClass.simpleName}")
        }
    }
    println("$passed passed, $failed failed, $pending TODO")
    check(failed == 0 && pending == 0) { "Complete the TODOs and fix failing tests." }
}

private fun normalized(value: Any?): Any? = when (value) {
    is IntArray -> value.toList()
    is CharArray -> value.toList()
    is Array<*> -> value.map(::normalized)
    is Iterable<*> -> value.map(::normalized)
    else -> value
}

fun expect(expected: Any?, actual: Any?) {
    val e = normalized(expected)
    val a = normalized(actual)
    check(e == a) { "Expected $e, got $a" }
}

// Sorting preserves multiplicity, so duplicate answers still fail.
private fun unordered(value: Any?): List<Any?> =
    (normalized(value) as List<*>).sortedBy { it.toString() }

fun expectUnordered(expected: Any?, actual: Any?) = expect(unordered(expected), unordered(actual))

fun expectGroups(expected: Any?, actual: Any?) {
    fun groups(value: Any?) = (normalized(value) as List<*>).map(::unordered)
    expectUnordered(groups(expected), groups(actual))
}

fun expectNear(expected: Double, actual: Double) {
    check(actual.isFinite() && abs(expected - actual) <= 1e-9 * max(1.0, abs(expected))) {
        "Expected approximately $expected, got $actual"
    }
}

fun chars(vararg rows: String): Array<CharArray> = rows.map(String::toCharArray).toTypedArray()

class ListNode(var `val`: Int) { var next: ListNode? = null }
class TreeNode(var `val`: Int) { var left: TreeNode? = null; var right: TreeNode? = null }
class RandomNode(var `val`: Int) { var next: RandomNode? = null; var random: RandomNode? = null }
class GraphNode(var `val`: Int) { var neighbors: ArrayList<GraphNode?> = ArrayList() }

private fun <T> identities(): MutableSet<T> = Collections.newSetFromMap(IdentityHashMap<T, Boolean>())

fun linked(vararg values: Int): ListNode? {
    val dummy = ListNode(0)
    var tail = dummy
    for (value in values) { tail.next = ListNode(value); tail = tail.next!! }
    return dummy.next
}

fun listValues(head: ListNode?): List<Int> {
    val result = mutableListOf<Int>()
    val seen = identities<ListNode>()
    var node = head
    while (node != null) {
        check(seen.add(node)) { "Unexpected cycle in output list" }
        result.add(node.`val`)
        node = node.next
    }
    return result
}

fun expectList(expected: List<Int>, actual: ListNode?) = expect(expected, listValues(actual))

// Level-order representation, with null for missing children.
fun tree(vararg values: Int?): TreeNode? {
    if (values.isEmpty() || values[0] == null) return null
    val root = TreeNode(values[0]!!)
    val queue = ArrayDeque<TreeNode>()
    queue.add(root)
    var i = 1
    while (queue.isNotEmpty() && i < values.size) {
        val node = queue.removeFirst()
        values[i++]?.let { node.left = TreeNode(it); queue.add(node.left!!) }
        if (i < values.size) values[i++]?.let { node.right = TreeNode(it); queue.add(node.right!!) }
    }
    check(i == values.size) { "Invalid level-order tree fixture" }
    return root
}

fun treeValues(root: TreeNode?): List<Int?> {
    if (root == null) return emptyList()
    val result = mutableListOf<Int?>()
    val seen = identities<TreeNode>()
    val queue = ArrayDeque<TreeNode?>()
    queue.add(root)
    while (queue.isNotEmpty()) {
        val node = queue.removeFirst()
        result.add(node?.`val`)
        if (node != null) {
            check(seen.add(node)) { "Output tree has a cycle or shared child" }
            queue.add(node.left); queue.add(node.right)
        }
    }
    while (result.lastOrNull() == null && result.isNotEmpty()) result.removeAt(result.lastIndex)
    return result
}

fun expectTree(expected: List<Int?>, actual: TreeNode?) = expect(expected, treeValues(actual))

fun expectRandomClone(original: RandomNode, clone: RandomNode?) {
    fun nodes(head: RandomNode?): List<RandomNode> {
        val result = mutableListOf<RandomNode>()
        val seen = identities<RandomNode>()
        var node = head
        while (node != null) {
            check(seen.add(node)) { "Unexpected cycle in next pointers" }
            result.add(node); node = node.next
        }
        return result
    }
    val originals = nodes(original)
    val copies = nodes(clone)
    expect(originals.map { it.`val` }, copies.map { it.`val` })
    check(copies.none { copy -> originals.any { it === copy } }) { "Clone reuses original nodes" }
    for (i in originals.indices) {
        val random = originals[i].random
        val index = if (random == null) -1 else originals.indexOfFirst { it === random }
        check(random == null || index >= 0) { "Invalid random-pointer fixture" }
        check(copies[i].random === if (index == -1) null else copies[index]) { "Incorrect random pointer at node $i" }
    }
}

fun expectGraphClone(original: GraphNode, clone: GraphNode?) {
    fun nodes(root: GraphNode?): Map<Int, GraphNode> {
        val found = mutableMapOf<Int, GraphNode>()
        val queue = ArrayDeque<GraphNode>()
        if (root != null) queue.add(root)
        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            val previous = found[node.`val`]
            if (previous != null) { check(previous === node) { "Two nodes have the same label" }; continue }
            found[node.`val`] = node
            node.neighbors.forEach { queue.add(checkNotNull(it) { "Null graph neighbor" }) }
        }
        return found
    }
    val originals = nodes(original)
    val copies = nodes(clone)
    expect(original.`val`, clone?.`val`)
    expectUnordered(originals.keys, copies.keys)
    for ((label, node) in originals) {
        val copy = copies.getValue(label)
        check(originals.values.none { it === copy }) { "Clone reuses original nodes" }
        expectUnordered(node.neighbors.map { it!!.`val` }, copy.neighbors.map { it!!.`val` })
    }
}

fun expectCourseOrder(n: Int, edges: Array<IntArray>, order: IntArray) {
    expect((0 until n).toList(), order.sorted())
    val positions = IntArray(n)
    order.forEachIndexed { i, course -> positions[course] = i }
    check(edges.all { positions[it[1]] < positions[it[0]] }) { "Prerequisite appears after its course: ${order.toList()}" }
}

fun expectAlienOrder(words: Array<String>, order: String) {
    val letters = words.flatMap { it.toList() }.toSet()
    check(order.length == letters.size && order.toSet() == letters) { "Expected every letter exactly once, got $order" }
    val ranks = order.withIndex().associate { it.value to it.index }
    for ((a, b) in words.asList().zipWithNext()) {
        val firstDifference = (0 until minOf(a.length, b.length)).firstOrNull { a[it] != b[it] }
        if (firstDifference == null) check(a.length <= b.length) { "Invalid prefix ordering" }
        else check(ranks.getValue(a[firstDifference]) < ranks.getValue(b[firstDifference])) { "Order $order contradicts $a before $b" }
    }
}
