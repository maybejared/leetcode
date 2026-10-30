// 1091. Shortest Path in Binary Matrix — Medium
// https://leetcode.com/problems/shortest-path-in-binary-matrix/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1091

import practice.*

class Solution {
    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
        TODO("Implement shortestPathBinaryMatrix")
    }
}

fun main() {
    runTests(
        "diagonal path" to {
            expect(2, Solution().shortestPathBinaryMatrix(arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))))
        },
        "blocked start" to {
            expect(-1, Solution().shortestPathBinaryMatrix(arrayOf(intArrayOf(1, 0), intArrayOf(0, 0))))
        },
        "single cell" to {
            expect(1, Solution().shortestPathBinaryMatrix(arrayOf(intArrayOf(0))))
        },
        "blocked destination" to {
            expect(-1, Solution().shortestPathBinaryMatrix(arrayOf(intArrayOf(0, 0), intArrayOf(0, 1))))
        },
    )
}
