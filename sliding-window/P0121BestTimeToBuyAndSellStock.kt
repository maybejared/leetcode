// 121. Best Time to Buy And Sell Stock — Easy
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0121

import practice.*

class Solution {
    fun maxProfit(prices: IntArray): Int {
        TODO("Implement maxProfit")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(8, 3, 6, 1, 7)" to {
            expect(6, Solution().maxProfit(intArrayOf(8, 3, 6, 1, 7)))
        },
        "case 2: intArrayOf(5, 4, 2)" to {
            expect(0, Solution().maxProfit(intArrayOf(5, 4, 2)))
        },
        "case 3: intArrayOf(3)" to {
            expect(0, Solution().maxProfit(intArrayOf(3)))
        },
    )
}
