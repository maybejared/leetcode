// 152. Maximum Product Subarray — Medium
// https://leetcode.com/problems/maximum-product-subarray/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0152

import practice.*

class Solution {
    fun maxProduct(nums: IntArray): Int {
        TODO("Implement maxProduct")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(-2, 3, -4)" to {
            expect(24, Solution().maxProduct(intArrayOf(-2, 3, -4)))
        },
        "case 2: intArrayOf(-2, 0, -1)" to {
            expect(0, Solution().maxProduct(intArrayOf(-2, 0, -1)))
        },
        "case 3: intArrayOf(-3)" to {
            expect(-3, Solution().maxProduct(intArrayOf(-3)))
        },
    )
}
