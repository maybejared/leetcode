package practice.checks

import practice.*

private fun rejects(block: () -> Unit) {
    val error = runCatching(block).exceptionOrNull()
    check(error is IllegalStateException) { "Invalid output was not rejected" }
}

fun main() {
    runTests(
        "nested arrays and unordered multiplicities" to {
            expect(arrayOf(intArrayOf(1, 2)), listOf(listOf(1, 2)))
            expectUnordered(listOf(1, 2), intArrayOf(2, 1))
            expectGroups(listOf(listOf(1, 2), listOf(3)), listOf(listOf(3), listOf(2, 1)))
            rejects { expectUnordered(listOf(1, 2), listOf(1, 1, 2)) }
            rejects { expect(listOf(1, 2), listOf(2, 1)) }
        },
        "list and tree serialization; cycle rejection" to {
            expectList(listOf(2, 4), linked(2, 4))
            expectTree(listOf(1, null, 2, 3), tree(1, null, 2, 3))
            val list = ListNode(1); list.next = list
            rejects { listValues(list) }
            val root = TreeNode(1); root.left = root
            rejects { treeValues(root) }
        },
        "random pointer clone identity" to {
            val original = RandomNode(3); original.random = original
            val copy = RandomNode(3); copy.random = copy
            expectRandomClone(original, copy)
            rejects { expectRandomClone(original, original) }
            copy.random = original
            rejects { expectRandomClone(original, copy) }
        },
        "graph clone identity and neighbor order" to {
            val a = GraphNode(1); val b = GraphNode(2); val c = GraphNode(3)
            a.neighbors.addAll(listOf(b, c)); b.neighbors.add(a); c.neighbors.add(a)
            val x = GraphNode(1); val y = GraphNode(2); val z = GraphNode(3)
            x.neighbors.addAll(listOf(z, y)); y.neighbors.add(x); z.neighbors.add(x)
            expectGraphClone(a, x)
            rejects { expectGraphClone(a, a) }
            x.neighbors.remove(y)
            rejects { expectGraphClone(a, x) }
        },
        "valid alternative orders; malformed answers rejected" to {
            val edges = arrayOf(intArrayOf(2, 0), intArrayOf(2, 1))
            expectCourseOrder(3, edges, intArrayOf(0, 1, 2))
            expectCourseOrder(3, edges, intArrayOf(1, 0, 2))
            rejects { expectCourseOrder(3, edges, intArrayOf(2, 0, 1)) }
            rejects { expectCourseOrder(3, edges, intArrayOf(0, 0, 2)) }
            expectAlienOrder(arrayOf("za", "zb"), "azb")
            rejects { expectAlienOrder(arrayOf("za", "zb"), "bza") }
            rejects { expectAlienOrder(arrayOf("abc", "ab"), "abc") }
        },
        "floating point tolerance rejects NaN and wrong values" to {
            expectNear(0.3, 0.1 + 0.2)
            rejects { expectNear(1.0, Double.NaN) }
            rejects { expectNear(1.0, 1.1) }
        },
    )
}
