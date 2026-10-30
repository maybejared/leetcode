// 122. Best Time to Buy and Sell Stock II — Medium
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0122

import practice.*

class Solution {
    fun maxProfit(prices: IntArray): Int {
        TODO("Implement maxProfit")
    }
}

fun main() {
    runTests(
        "multiple trades" to {
            expect(7, Solution().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        },
        "increasing" to {
            expect(4, Solution().maxProfit(intArrayOf(1, 2, 3, 4, 5)))
        },
        "decreasing" to {
            expect(0, Solution().maxProfit(intArrayOf(7, 6, 4, 3, 1)))
        },
    )
}
