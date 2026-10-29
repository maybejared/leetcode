// 4. Median of Two Sorted Arrays — Hard
// https://leetcode.com/problems/median-of-two-sorted-arrays/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0004

import practice.*

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        TODO("Implement findMedianSortedArrays")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 5), intArrayOf(2, 3, 8)" to {
            expect(3.0, Solution().findMedianSortedArrays(intArrayOf(1, 5), intArrayOf(2, 3, 8)))
        },
        "case 2: intArrayOf(1, 4), intArrayOf(2, 7)" to {
            expect(3.0, Solution().findMedianSortedArrays(intArrayOf(1, 4), intArrayOf(2, 7)))
        },
        "case 3: intArrayOf(), intArrayOf(6)" to {
            expect(6.0, Solution().findMedianSortedArrays(intArrayOf(), intArrayOf(6)))
        },
    )
}
