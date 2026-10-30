// 75. Sort Colors — Medium
// https://leetcode.com/problems/sort-colors/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0075

import practice.*

class Solution {
    fun sortColors(nums: IntArray): Unit {
        TODO("Implement sortColors")
    }
}

fun main() {
    runTests(
        "mixed colors" to {
            val nums = intArrayOf(2, 0, 2, 1, 1, 0); Solution().sortColors(nums); expect(intArrayOf(0, 0, 1, 1, 2, 2), nums)
        },
        "two colors" to {
            val nums = intArrayOf(2, 0, 1); Solution().sortColors(nums); expect(intArrayOf(0, 1, 2), nums)
        },
        "single color" to {
            val nums = intArrayOf(1); Solution().sortColors(nums); expect(intArrayOf(1), nums)
        },
    )
}
