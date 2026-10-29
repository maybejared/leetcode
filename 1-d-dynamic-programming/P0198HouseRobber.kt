// 198. House Robber — Medium
// https://leetcode.com/problems/house-robber/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0198

import practice.*

class Solution {
    fun rob(nums: IntArray): Int {
        TODO("Implement rob")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(3, 2, 5, 1)" to {
            expect(8, Solution().rob(intArrayOf(3, 2, 5, 1)))
        },
        "case 2: intArrayOf(8)" to {
            expect(8, Solution().rob(intArrayOf(8)))
        },
        "case 3: intArrayOf(0, 0)" to {
            expect(0, Solution().rob(intArrayOf(0, 0)))
        },
    )
}
