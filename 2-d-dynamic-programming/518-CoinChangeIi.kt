// 518. Coin Change II — Medium
// https://leetcode.com/problems/coin-change-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0518

import practice.*

class Solution {
    fun change(amount: Int, coins: IntArray): Int {
        TODO("Implement change")
    }
}

fun main() {
    runTests(
        "case 1: 6, intArrayOf(1, 3, 4)" to {
            expect(4, Solution().change(6, intArrayOf(1, 3, 4)))
        },
        "case 2: 5, intArrayOf(2, 4)" to {
            expect(0, Solution().change(5, intArrayOf(2, 4)))
        },
        "case 3: 0, intArrayOf(2)" to {
            expect(1, Solution().change(0, intArrayOf(2)))
        },
    )
}
