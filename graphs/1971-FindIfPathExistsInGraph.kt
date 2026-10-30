// 1971. Find if Path Exists in Graph — Easy
// https://leetcode.com/problems/find-if-path-exists-in-graph/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1971

import practice.*

class Solution {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        TODO("Implement validPath")
    }
}

fun main() {
    runTests(
        "connected" to {
            expect(true, Solution().validPath(3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 0)), 0, 2))
        },
        "disconnected" to {
            expect(false, Solution().validPath(4, arrayOf(intArrayOf(0, 1), intArrayOf(2, 3)), 0, 3))
        },
        "same vertex" to {
            expect(true, Solution().validPath(1, emptyArray(), 0, 0))
        },
    )
}
