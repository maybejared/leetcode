// 673. Number of Longest Increasing Subsequence — Medium
// https://leetcode.com/problems/number-of-longest-increasing-subsequence/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0673

import practice.*

class Solution {
    fun findNumberOfLIS(nums: IntArray): Int {
        TODO("Implement findNumberOfLIS")
    }
}

fun main() {
    runTests(
        "two longest subsequences" to {
            expect(2, Solution().findNumberOfLIS(intArrayOf(1, 3, 5, 4, 7)))
        },
        "equal elements are separate subsequences" to {
            expect(5, Solution().findNumberOfLIS(intArrayOf(2, 2, 2, 2, 2)))
        },
        "single increasing sequence" to {
            expect(1, Solution().findNumberOfLIS(intArrayOf(1, 2, 3)))
        },
    )
}
