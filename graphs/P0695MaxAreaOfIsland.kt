// 695. Max Area of Island — Medium
// https://leetcode.com/problems/max-area-of-island/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0695

import practice.*

class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        TODO("Implement maxAreaOfIsland")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 1, 0), intArrayOf(0, 1, 0), intArrayOf(1, 0, 1))" to {
            expect(3, Solution().maxAreaOfIsland(arrayOf(intArrayOf(1, 1, 0), intArrayOf(0, 1, 0), intArrayOf(1, 0, 1))))
        },
        "case 2: arrayOf(intArrayOf(0, 0))" to {
            expect(0, Solution().maxAreaOfIsland(arrayOf(intArrayOf(0, 0))))
        },
        "case 3: arrayOf(intArrayOf(1))" to {
            expect(1, Solution().maxAreaOfIsland(arrayOf(intArrayOf(1))))
        },
    )
}
