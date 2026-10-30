// 283. Move Zeroes — Easy
// https://leetcode.com/problems/move-zeroes/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0283

import practice.*

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        TODO("Implement moveZeroes")
    }
}

fun main() {
    runTests(
        "stable movement" to {
            val nums = intArrayOf(0, 1, 0, 3, 12); Solution().moveZeroes(nums); expect(intArrayOf(1, 3, 12, 0, 0), nums)
        },
        "all zeros" to {
            val nums = intArrayOf(0, 0); Solution().moveZeroes(nums); expect(intArrayOf(0, 0), nums)
        },
        "no zeros" to {
            val nums = intArrayOf(1, 2); Solution().moveZeroes(nums); expect(intArrayOf(1, 2), nums)
        },
    )
}
