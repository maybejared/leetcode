// 300. Longest Increasing Subsequence — Medium
// https://leetcode.com/problems/longest-increasing-subsequence/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0300

import practice.*

class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        TODO("Implement lengthOfLIS")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(4, 1, 3, 2, 5)" to {
            expect(3, Solution().lengthOfLIS(intArrayOf(4, 1, 3, 2, 5)))
        },
        "case 2: intArrayOf(2, 2, 2)" to {
            expect(1, Solution().lengthOfLIS(intArrayOf(2, 2, 2)))
        },
        "case 3: intArrayOf(5, 4, 3)" to {
            expect(1, Solution().lengthOfLIS(intArrayOf(5, 4, 3)))
        },
    )
}
