// 34. Find First and Last Position of Element in Sorted Array — Medium
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0034

import practice.*

class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        TODO("Implement searchRange")
    }
}

fun main() {
    runTests(
        "repeated target" to {
            expect(intArrayOf(3, 4), Solution().searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8))
        },
        "missing" to {
            expect(intArrayOf(-1, -1), Solution().searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6))
        },
        "empty" to {
            expect(intArrayOf(-1, -1), Solution().searchRange(intArrayOf(), 0))
        },
        "all equal" to {
            expect(intArrayOf(0, 2), Solution().searchRange(intArrayOf(2, 2, 2), 2))
        },
    )
}
