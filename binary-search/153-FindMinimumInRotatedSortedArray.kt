// 153. Find Minimum In Rotated Sorted Array — Medium
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0153

import practice.*

class Solution {
    fun findMin(nums: IntArray): Int {
        TODO("Implement findMin")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(7, 9, 1, 3, 5)" to {
            expect(1, Solution().findMin(intArrayOf(7, 9, 1, 3, 5)))
        },
        "case 2: intArrayOf(1, 2, 3)" to {
            expect(1, Solution().findMin(intArrayOf(1, 2, 3)))
        },
        "case 3: intArrayOf(8)" to {
            expect(8, Solution().findMin(intArrayOf(8)))
        },
    )
}
