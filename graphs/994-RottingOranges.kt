// 994. Rotting Oranges — Medium
// https://leetcode.com/problems/rotting-oranges/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0994

import practice.*

class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        TODO("Implement orangesRotting")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(2, 1, 1), intArrayOf(0, 1, 1))" to {
            expect(3, Solution().orangesRotting(arrayOf(intArrayOf(2, 1, 1), intArrayOf(0, 1, 1))))
        },
        "case 2: arrayOf(intArrayOf(2, 0, 1))" to {
            expect(-1, Solution().orangesRotting(arrayOf(intArrayOf(2, 0, 1))))
        },
        "case 3: arrayOf(intArrayOf(0, 2))" to {
            expect(0, Solution().orangesRotting(arrayOf(intArrayOf(0, 2))))
        },
    )
}
