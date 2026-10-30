// 221. Maximal Square — Medium
// https://leetcode.com/problems/maximal-square/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0221

import practice.*

class Solution {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        TODO("Implement maximalSquare")
    }
}

fun main() {
    runTests(
        "area of largest square" to {
            expect(4, Solution().maximalSquare(chars("10100", "10111", "11111", "10010")))
        },
        "no filled cells" to {
            expect(0, Solution().maximalSquare(chars("00", "00")))
        },
        "single row" to {
            expect(1, Solution().maximalSquare(chars("1111")))
        },
        "whole square" to {
            expect(9, Solution().maximalSquare(chars("111", "111", "111")))
        },
    )
}
