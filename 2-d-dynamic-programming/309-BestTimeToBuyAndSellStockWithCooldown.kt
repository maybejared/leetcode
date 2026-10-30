// 309. Best Time to Buy And Sell Stock With Cooldown — Medium
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0309

import practice.*

class Solution {
    fun maxProfit(prices: IntArray): Int {
        TODO("Implement maxProfit")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 2, 3, 0, 2)" to {
            expect(3, Solution().maxProfit(intArrayOf(1, 2, 3, 0, 2)))
        },
        "case 2: intArrayOf(4, 3, 2)" to {
            expect(0, Solution().maxProfit(intArrayOf(4, 3, 2)))
        },
        "case 3: intArrayOf(1, 4)" to {
            expect(3, Solution().maxProfit(intArrayOf(1, 4)))
        },
    )
}
