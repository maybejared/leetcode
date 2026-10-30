// 986. Interval List Intersections — Medium
// https://leetcode.com/problems/interval-list-intersections/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0986

import practice.*

class Solution {
    fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
        TODO("Implement intervalIntersection")
    }
}

fun main() {
    runTests(
        "overlaps and touching boundaries" to {
            expect(arrayOf(intArrayOf(1, 2), intArrayOf(5, 5), intArrayOf(8, 10), intArrayOf(15, 23), intArrayOf(24, 24), intArrayOf(25, 25)), Solution().intervalIntersection(arrayOf(intArrayOf(0, 2), intArrayOf(5, 10), intArrayOf(13, 23), intArrayOf(24, 25)), arrayOf(intArrayOf(1, 5), intArrayOf(8, 12), intArrayOf(15, 24), intArrayOf(25, 26))))
        },
        "empty second list" to {
            expect(emptyArray<IntArray>(), Solution().intervalIntersection(arrayOf(intArrayOf(1, 3)), emptyArray()))
        },
        "disjoint" to {
            expect(emptyArray<IntArray>(), Solution().intervalIntersection(arrayOf(intArrayOf(1, 2)), arrayOf(intArrayOf(3, 4))))
        },
    )
}
