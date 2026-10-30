// 189. Rotate Array — Medium
// https://leetcode.com/problems/rotate-array/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0189

import practice.*

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        TODO("Implement rotate")
    }
}

fun main() {
    runTests(
        "rotate right" to {
            val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7); Solution().rotate(nums, 3); expect(intArrayOf(5, 6, 7, 1, 2, 3, 4), nums)
        },
        "k exceeds length" to {
            val nums = intArrayOf(1, 2, 3); Solution().rotate(nums, 4); expect(intArrayOf(3, 1, 2), nums)
        },
        "zero rotation" to {
            val nums = intArrayOf(1, 2); Solution().rotate(nums, 0); expect(intArrayOf(1, 2), nums)
        },
    )
}
