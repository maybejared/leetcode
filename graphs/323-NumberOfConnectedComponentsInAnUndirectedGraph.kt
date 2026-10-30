// 323. Number of Connected Components In An Undirected Graph — Medium
// https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0323

import practice.*

class Solution {
    fun countComponents(n: Int, edges: Array<IntArray>): Int {
        TODO("Implement countComponents")
    }
}

fun main() {
    runTests(
        "case 1: 5, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(3, 4))" to {
            expect(2, Solution().countComponents(5, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(3, 4))))
        },
        "case 2: 3, emptyArray<IntArray>()" to {
            expect(3, Solution().countComponents(3, emptyArray<IntArray>()))
        },
        "case 3: 3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2))" to {
            expect(1, Solution().countComponents(3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2))))
        },
    )
}
