// 1851. Minimum Interval to Include Each Query — Hard
// https://leetcode.com/problems/minimum-interval-to-include-each-query/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1851

import practice.*

class Solution {
    fun minInterval(intervals: Array<IntArray>, queries: IntArray): IntArray {
        TODO("Implement minInterval")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 4), intArrayOf(2, 2), intArrayOf(5, 8)), intArrayOf(2, 4, 9)" to {
            expect(intArrayOf(1, 4, -1), Solution().minInterval(arrayOf(intArrayOf(1, 4), intArrayOf(2, 2), intArrayOf(5, 8)), intArrayOf(2, 4, 9)))
        },
        "case 2: arrayOf(intArrayOf(3, 3)), intArrayOf(3, 3)" to {
            expect(intArrayOf(1, 1), Solution().minInterval(arrayOf(intArrayOf(3, 3)), intArrayOf(3, 3)))
        },
        "case 3: arrayOf(intArrayOf(1, 10), intArrayOf(2, 4)), intArrayOf(4, 1, 2)" to {
            expect(intArrayOf(3, 10, 3), Solution().minInterval(arrayOf(intArrayOf(1, 10), intArrayOf(2, 4)), intArrayOf(4, 1, 2)))
        },
    )
}
