// 26. Remove Duplicates from Sorted Array — Easy
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0026

import practice.*

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        TODO("Implement removeDuplicates")
    }
}

fun main() {
    runTests(
        "repeated values" to {
            val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4); val k = Solution().removeDuplicates(nums); expect(5, k); expect(intArrayOf(0, 1, 2, 3, 4), nums.take(k).toIntArray())
        },
        "all equal" to {
            val nums = intArrayOf(2, 2, 2); val k = Solution().removeDuplicates(nums); expect(1, k); expect(listOf(2), nums.take(k))
        },
    )
}
