// 435. Non Overlapping Intervals — Medium
// https://leetcode.com/problems/non-overlapping-intervals/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0435

import practice.*

class Solution {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        TODO("Implement eraseOverlapIntervals")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 3), intArrayOf(2, 4), intArrayOf(3, 5))" to {
            expect(1, Solution().eraseOverlapIntervals(arrayOf(intArrayOf(1, 3), intArrayOf(2, 4), intArrayOf(3, 5))))
        },
        "case 2: arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))" to {
            expect(0, Solution().eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))))
        },
        "case 3: arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 2))" to {
            expect(2, Solution().eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 2))))
        },
    )
}
