// 322. Coin Change — Medium
// https://leetcode.com/problems/coin-change/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0322

import practice.*

class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        TODO("Implement coinChange")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 3, 4), 6" to {
            expect(2, Solution().coinChange(intArrayOf(1, 3, 4), 6))
        },
        "case 2: intArrayOf(4, 6), 5" to {
            expect(-1, Solution().coinChange(intArrayOf(4, 6), 5))
        },
        "case 3: intArrayOf(2), 0" to {
            expect(0, Solution().coinChange(intArrayOf(2), 0))
        },
    )
}
