// 875. Koko Eating Bananas — Medium
// https://leetcode.com/problems/koko-eating-bananas/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0875

import practice.*

class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        TODO("Implement minEatingSpeed")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(4, 8, 12), 6" to {
            expect(4, Solution().minEatingSpeed(intArrayOf(4, 8, 12), 6))
        },
        "case 2: intArrayOf(9, 5), 2" to {
            expect(9, Solution().minEatingSpeed(intArrayOf(9, 5), 2))
        },
        "case 3: intArrayOf(1_000_000_000, 1_000_000_000, 1_000_000_000), 1_000_000_000" to {
            expect(4, Solution().minEatingSpeed(intArrayOf(1_000_000_000, 1_000_000_000, 1_000_000_000), 1_000_000_000))
        },
    )
}
