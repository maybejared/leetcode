// 36. Valid Sudoku — Medium
// https://leetcode.com/problems/valid-sudoku/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0036

import practice.*

class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        TODO("Implement isValidSudoku")
    }
}

fun main() {
    runTests(
        "valid sparse board" to {
            val b = Array(9) { CharArray(9) { '.' } }; b[0][0] = '1'; b[1][3] = '1'; expect(true, Solution().isValidSudoku(b))
        },
        "duplicate row" to {
            val b = Array(9) { CharArray(9) { '.' } }; b[0][0] = '5'; b[0][4] = '5'; expect(false, Solution().isValidSudoku(b))
        },
        "duplicate column" to {
            val b = Array(9) { CharArray(9) { '.' } }; b[0][0] = '3'; b[4][0] = '3'; expect(false, Solution().isValidSudoku(b))
        },
        "duplicate box" to {
            val b = Array(9) { CharArray(9) { '.' } }; b[0][0] = '8'; b[1][1] = '8'; expect(false, Solution().isValidSudoku(b))
        },
    )
}
