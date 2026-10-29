// 51. N Queens — Hard
// https://leetcode.com/problems/n-queens/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0051

import practice.*

class Solution {
    fun solveNQueens(n: Int): List<List<String>> {
        TODO("Implement solveNQueens")
    }
}

fun main() {
    runTests(
        "case 1: 1" to {
            expectUnordered(listOf(listOf("Q")), Solution().solveNQueens(1))
        },
        "case 2: 3" to {
            expectUnordered(emptyList<List<String>>(), Solution().solveNQueens(3))
        },
        "case 3: 4" to {
            expectUnordered(listOf(listOf(".Q..", "...Q", "Q...", "..Q."), listOf("..Q.", "Q...", "...Q", ".Q..")), Solution().solveNQueens(4))
        },
    )
}
