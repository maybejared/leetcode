// 785. Is Graph Bipartite — Medium
// https://leetcode.com/problems/is-graph-bipartite/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0785

import practice.*

class Solution {
    fun isBipartite(graph: Array<IntArray>): Boolean {
        TODO("Implement isBipartite")
    }
}

fun main() {
    runTests(
        "even cycle" to {
            expect(true, Solution().isBipartite(arrayOf(intArrayOf(1, 3), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(0, 2))))
        },
        "odd cycle" to {
            expect(false, Solution().isBipartite(arrayOf(intArrayOf(1, 2), intArrayOf(0, 2), intArrayOf(0, 1))))
        },
        "disconnected odd cycle" to {
            expect(false, Solution().isBipartite(arrayOf(intArrayOf(), intArrayOf(2, 3), intArrayOf(1, 3), intArrayOf(1, 2))))
        },
        "isolated vertex" to {
            expect(true, Solution().isBipartite(arrayOf(intArrayOf())))
        },
    )
}
