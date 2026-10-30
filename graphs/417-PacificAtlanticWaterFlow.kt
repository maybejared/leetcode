// 417. Pacific Atlantic Water Flow — Medium
// https://leetcode.com/problems/pacific-atlantic-water-flow/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0417

import practice.*

class Solution {
    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
        TODO("Implement pacificAtlantic")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 2), intArrayOf(4, 3))" to {
            expectUnordered(listOf(listOf(0, 1), listOf(1, 0), listOf(1, 1)), Solution().pacificAtlantic(arrayOf(intArrayOf(1, 2), intArrayOf(4, 3))))
        },
        "case 2: arrayOf(intArrayOf(5))" to {
            expectUnordered(listOf(listOf(0, 0)), Solution().pacificAtlantic(arrayOf(intArrayOf(5))))
        },
        "case 3: arrayOf(intArrayOf(2, 2), intArrayOf(2, 2))" to {
            expectUnordered(listOf(listOf(0, 0), listOf(0, 1), listOf(1, 0), listOf(1, 1)), Solution().pacificAtlantic(arrayOf(intArrayOf(2, 2), intArrayOf(2, 2))))
        },
    )
}
