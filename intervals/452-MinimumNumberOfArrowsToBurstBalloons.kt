// 452. Minimum Number of Arrows to Burst Balloons — Medium
// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0452

import practice.*

class Solution {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        TODO("Implement findMinArrowShots")
    }
}

fun main() {
    runTests(
        "overlapping groups" to {
            expect(2, Solution().findMinArrowShots(arrayOf(intArrayOf(10, 16), intArrayOf(2, 8), intArrayOf(1, 6), intArrayOf(7, 12))))
        },
        "touching endpoints" to {
            expect(1, Solution().findMinArrowShots(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))))
        },
        "disjoint" to {
            expect(3, Solution().findMinArrowShots(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6))))
        },
    )
}
