// 1631. Path With Minimum Effort — Medium
// https://leetcode.com/problems/path-with-minimum-effort/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1631

import practice.*

class Solution {
    fun minimumEffortPath(heights: Array<IntArray>): Int {
        TODO("Implement minimumEffortPath")
    }
}

fun main() {
    runTests(
        "minimize maximum edge" to {
            expect(2, Solution().minimumEffortPath(arrayOf(intArrayOf(1, 2, 2), intArrayOf(3, 8, 2), intArrayOf(5, 3, 5))))
        },
        "alternative path" to {
            expect(1, Solution().minimumEffortPath(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 8, 4), intArrayOf(5, 3, 5))))
        },
        "single cell" to {
            expect(0, Solution().minimumEffortPath(arrayOf(intArrayOf(7))))
        },
    )
}
