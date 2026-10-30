// 64. Minimum Path Sum — Medium
// https://leetcode.com/problems/minimum-path-sum/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0064

import practice.*

class Solution {
    fun minPathSum(grid: Array<IntArray>): Int {
        TODO("Implement minPathSum")
    }
}

fun main() {
    runTests(
        "square grid" to {
            expect(7, Solution().minPathSum(arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1))))
        },
        "rectangular grid" to {
            expect(12, Solution().minPathSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))))
        },
        "single cell" to {
            expect(0, Solution().minPathSum(arrayOf(intArrayOf(0))))
        },
    )
}
