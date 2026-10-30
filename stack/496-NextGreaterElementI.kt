// 496. Next Greater Element I — Easy
// https://leetcode.com/problems/next-greater-element-i/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0496

import practice.*

class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        TODO("Implement nextGreaterElement")
    }
}

fun main() {
    runTests(
        "mixed results" to {
            expect(intArrayOf(-1, 3, -1), Solution().nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2)))
        },
        "increasing values" to {
            expect(intArrayOf(3, -1), Solution().nextGreaterElement(intArrayOf(2, 4), intArrayOf(1, 2, 3, 4)))
        },
    )
}
