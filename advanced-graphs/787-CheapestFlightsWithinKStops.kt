// 787. Cheapest Flights Within K Stops — Medium
// https://leetcode.com/problems/cheapest-flights-within-k-stops/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0787

import practice.*

class Solution {
    fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
        TODO("Implement findCheapestPrice")
    }
}

fun main() {
    runTests(
        "case 1: 3, arrayOf(intArrayOf(0, 1, 50), intArrayOf(1, 2, 50), intArrayOf(0, 2, 150)), 0, 2, 1" to {
            expect(100, Solution().findCheapestPrice(3, arrayOf(intArrayOf(0, 1, 50), intArrayOf(1, 2, 50), intArrayOf(0, 2, 150)), 0, 2, 1))
        },
        "case 2: 3, arrayOf(intArrayOf(0, 1, 50), intArrayOf(1, 2, 50), intArrayOf(0, 2, 150)), 0, 2, 0" to {
            expect(150, Solution().findCheapestPrice(3, arrayOf(intArrayOf(0, 1, 50), intArrayOf(1, 2, 50), intArrayOf(0, 2, 150)), 0, 2, 0))
        },
        "case 3: 3, arrayOf(intArrayOf(0, 1, 50)), 0, 2, 2" to {
            expect(-1, Solution().findCheapestPrice(3, arrayOf(intArrayOf(0, 1, 50)), 0, 2, 2))
        },
    )
}
