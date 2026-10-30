// 74. Search a 2D Matrix — Medium
// https://leetcode.com/problems/search-a-2d-matrix/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0074

import practice.*

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        TODO("Implement searchMatrix")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), 6" to {
            expect(true, Solution().searchMatrix(arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), 6))
        },
        "case 2: arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), 4" to {
            expect(false, Solution().searchMatrix(arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), 4))
        },
        "case 3: arrayOf(intArrayOf(2)), 2" to {
            expect(true, Solution().searchMatrix(arrayOf(intArrayOf(2)), 2))
        },
    )
}
