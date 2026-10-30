// 133. Clone Graph — Medium
// https://leetcode.com/problems/clone-graph/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0133

import practice.*
import practice.GraphNode as Node

class Solution {
    fun cloneGraph(node: Node?): Node? {
        TODO("Implement cloneGraph")
    }
}

fun main() {
    runTests(
        "cycle" to {
            val a = Node(1); val b = Node(2); val c = Node(3); a.neighbors.addAll(listOf(b, c)); b.neighbors.addAll(listOf(a, c)); c.neighbors.addAll(listOf(a, b)); expectGraphClone(a, Solution().cloneGraph(a))
        },
        "isolated node" to {
            val a = Node(1); expectGraphClone(a, Solution().cloneGraph(a))
        },
        "empty" to {
            expect(null, Solution().cloneGraph(null))
        },
    )
}
