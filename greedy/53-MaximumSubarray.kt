// 53. Maximum Subarray — Medium
// https://leetcode.com/problems/maximum-subarray/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0053

import practice.*

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        TODO("Implement maxSubArray")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(-3, 4, -1, 2, -6)" to {
            expect(5, Solution().maxSubArray(intArrayOf(-3, 4, -1, 2, -6)))
        },
        "case 2: intArrayOf(-4, -2, -7)" to {
            expect(-2, Solution().maxSubArray(intArrayOf(-4, -2, -7)))
        },
        "case 3: intArrayOf(0)" to {
            expect(0, Solution().maxSubArray(intArrayOf(0)))
        },
    )
}
