// 279. Perfect Squares — Medium
// https://leetcode.com/problems/perfect-squares/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0279

import practice.*

class Solution {
    fun numSquares(n: Int): Int {
        TODO("Implement numSquares")
    }
}

fun main() {
    runTests(
        "three squares" to {
            expect(3, Solution().numSquares(12))
        },
        "two squares" to {
            expect(2, Solution().numSquares(13))
        },
        "perfect square" to {
            expect(1, Solution().numSquares(16))
        },
        "four squares" to {
            expect(4, Solution().numSquares(7))
        },
    )
}
