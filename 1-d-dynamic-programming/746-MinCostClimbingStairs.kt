// 746. Min Cost Climbing Stairs — Easy
// https://leetcode.com/problems/min-cost-climbing-stairs/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0746

import practice.*

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        TODO("Implement minCostClimbingStairs")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(5, 9, 2)" to {
            expect(7, Solution().minCostClimbingStairs(intArrayOf(5, 9, 2)))
        },
        "case 2: intArrayOf(3, 1)" to {
            expect(1, Solution().minCostClimbingStairs(intArrayOf(3, 1)))
        },
        "case 3: intArrayOf(0, 0, 0)" to {
            expect(0, Solution().minCostClimbingStairs(intArrayOf(0, 0, 0)))
        },
    )
}
