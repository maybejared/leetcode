// 312. Burst Balloons — Hard
// https://leetcode.com/problems/burst-balloons/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0312

import practice.*

class Solution {
    fun maxCoins(nums: IntArray): Int {
        TODO("Implement maxCoins")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(2, 3)" to {
            expect(9, Solution().maxCoins(intArrayOf(2, 3)))
        },
        "case 2: intArrayOf(4)" to {
            expect(4, Solution().maxCoins(intArrayOf(4)))
        },
        "case 3: intArrayOf(0, 2)" to {
            expect(2, Solution().maxCoins(intArrayOf(0, 2)))
        },
    )
}
