// 213. House Robber II — Medium
// https://leetcode.com/problems/house-robber-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0213

import practice.*

class Solution {
    fun rob(nums: IntArray): Int {
        TODO("Implement rob")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(5, 1, 5)" to {
            expect(5, Solution().rob(intArrayOf(5, 1, 5)))
        },
        "case 2: intArrayOf(2, 3, 2, 4)" to {
            expect(7, Solution().rob(intArrayOf(2, 3, 2, 4)))
        },
        "case 3: intArrayOf(8)" to {
            expect(8, Solution().rob(intArrayOf(8)))
        },
    )
}
