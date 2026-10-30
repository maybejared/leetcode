// 63. Unique Paths II — Medium
// https://leetcode.com/problems/unique-paths-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0063

import practice.*

class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        TODO("Implement uniquePathsWithObstacles")
    }
}

fun main() {
    runTests(
        "central obstacle" to {
            expect(2, Solution().uniquePathsWithObstacles(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))))
        },
        "blocked start" to {
            expect(0, Solution().uniquePathsWithObstacles(arrayOf(intArrayOf(1))))
        },
        "single open cell" to {
            expect(1, Solution().uniquePathsWithObstacles(arrayOf(intArrayOf(0))))
        },
        "blocked destination" to {
            expect(0, Solution().uniquePathsWithObstacles(arrayOf(intArrayOf(0, 0), intArrayOf(0, 1))))
        },
    )
}
