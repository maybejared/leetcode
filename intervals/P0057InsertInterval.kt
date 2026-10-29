// 57. Insert Interval — Medium
// https://leetcode.com/problems/insert-interval/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0057

import practice.*

class Solution {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        TODO("Implement insert")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 2), intArrayOf(5, 7)), intArrayOf(2, 6)" to {
            expect(arrayOf(intArrayOf(1, 7)), Solution().insert(arrayOf(intArrayOf(1, 2), intArrayOf(5, 7)), intArrayOf(2, 6)))
        },
        "case 2: emptyArray<IntArray>(), intArrayOf(3, 4)" to {
            expect(arrayOf(intArrayOf(3, 4)), Solution().insert(emptyArray<IntArray>(), intArrayOf(3, 4)))
        },
        "case 3: arrayOf(intArrayOf(1, 2), intArrayOf(5, 7)), intArrayOf(3, 4)" to {
            expect(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 7)), Solution().insert(arrayOf(intArrayOf(1, 2), intArrayOf(5, 7)), intArrayOf(3, 4)))
        },
    )
}
