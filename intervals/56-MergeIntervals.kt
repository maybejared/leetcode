// 56. Merge Intervals — Medium
// https://leetcode.com/problems/merge-intervals/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0056

import practice.*

class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        TODO("Implement merge")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(5, 7), intArrayOf(1, 3), intArrayOf(2, 6))" to {
            expectUnordered(arrayOf(intArrayOf(1, 7)), Solution().merge(arrayOf(intArrayOf(5, 7), intArrayOf(1, 3), intArrayOf(2, 6))))
        },
        "case 2: arrayOf(intArrayOf(1, 2), intArrayOf(2, 4))" to {
            expectUnordered(arrayOf(intArrayOf(1, 4)), Solution().merge(arrayOf(intArrayOf(1, 2), intArrayOf(2, 4))))
        },
        "case 3: arrayOf(intArrayOf(1, 2), intArrayOf(4, 5))" to {
            expectUnordered(arrayOf(intArrayOf(1, 2), intArrayOf(4, 5)), Solution().merge(arrayOf(intArrayOf(1, 2), intArrayOf(4, 5))))
        },
    )
}
