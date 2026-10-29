// 494. Target Sum — Medium
// https://leetcode.com/problems/target-sum/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0494

import practice.*

class Solution {
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        TODO("Implement findTargetSumWays")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 2, 1), 2" to {
            expect(2, Solution().findTargetSumWays(intArrayOf(1, 2, 1), 2))
        },
        "case 2: intArrayOf(0, 0, 1), 1" to {
            expect(4, Solution().findTargetSumWays(intArrayOf(0, 0, 1), 1))
        },
        "case 3: intArrayOf(2), 1" to {
            expect(0, Solution().findTargetSumWays(intArrayOf(2), 1))
        },
    )
}
