// 162. Find Peak Element — Medium
// https://leetcode.com/problems/find-peak-element/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0162

import practice.*

class Solution {
    fun findPeakElement(nums: IntArray): Int {
        TODO("Implement findPeakElement")
    }
}

fun main() {
    runTests(
        "single peak" to {
            expect(2, Solution().findPeakElement(intArrayOf(1, 2, 3, 1)))
        },
        "multiple valid peaks" to {
            val nums = intArrayOf(1, 2, 1, 3, 5, 6, 4); val i = Solution().findPeakElement(nums); check(i in nums.indices); check(i == 0 || nums[i] > nums[i - 1]); check(i == nums.lastIndex || nums[i] > nums[i + 1])
        },
        "singleton" to {
            expect(0, Solution().findPeakElement(intArrayOf(1)))
        },
        "decreasing" to {
            expect(0, Solution().findPeakElement(intArrayOf(3, 2, 1)))
        },
    )
}
