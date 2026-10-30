// 329. Longest Increasing Path In a Matrix — Hard
// https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0329

import practice.*

class Solution {
    fun longestIncreasingPath(matrix: Array<IntArray>): Int {
        TODO("Implement longestIncreasingPath")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 2), intArrayOf(4, 3))" to {
            expect(4, Solution().longestIncreasingPath(arrayOf(intArrayOf(1, 2), intArrayOf(4, 3))))
        },
        "case 2: arrayOf(intArrayOf(7, 7), intArrayOf(7, 7))" to {
            expect(1, Solution().longestIncreasingPath(arrayOf(intArrayOf(7, 7), intArrayOf(7, 7))))
        },
        "case 3: arrayOf(intArrayOf(8))" to {
            expect(1, Solution().longestIncreasingPath(arrayOf(intArrayOf(8))))
        },
    )
}
