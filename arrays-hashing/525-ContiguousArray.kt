// 525. Contiguous Array — Medium
// https://leetcode.com/problems/contiguous-array/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0525

import practice.*

class Solution {
    fun findMaxLength(nums: IntArray): Int {
        TODO("Implement findMaxLength")
    }
}

fun main() {
    runTests(
        "balanced pair" to {
            expect(2, Solution().findMaxLength(intArrayOf(0, 1)))
        },
        "unbalanced tail" to {
            expect(2, Solution().findMaxLength(intArrayOf(0, 1, 0)))
        },
        "whole array" to {
            expect(6, Solution().findMaxLength(intArrayOf(0, 0, 1, 0, 1, 1)))
        },
        "no match" to {
            expect(0, Solution().findMaxLength(intArrayOf(1, 1)))
        },
    )
}
