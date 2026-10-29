// 261. Graph Valid Tree — Medium
// https://leetcode.com/problems/graph-valid-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0261

import practice.*

class Solution {
    fun validTree(n: Int, edges: Array<IntArray>): Boolean {
        TODO("Implement validTree")
    }
}

fun main() {
    runTests(
        "case 1: 4, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3))" to {
            expect(true, Solution().validTree(4, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3))))
        },
        "case 2: 4, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 0))" to {
            expect(false, Solution().validTree(4, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 0))))
        },
        "case 3: 1, emptyArray<IntArray>()" to {
            expect(true, Solution().validTree(1, emptyArray<IntArray>()))
        },
        "case 4: 3, arrayOf(intArrayOf(0, 1))" to {
            expect(false, Solution().validTree(3, arrayOf(intArrayOf(0, 1))))
        },
    )
}
