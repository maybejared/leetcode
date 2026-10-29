// 134. Gas Station — Medium
// https://leetcode.com/problems/gas-station/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0134

import practice.*

class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        TODO("Implement canCompleteCircuit")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 2, 4), intArrayOf(2, 3, 2)" to {
            expect(2, Solution().canCompleteCircuit(intArrayOf(1, 2, 4), intArrayOf(2, 3, 2)))
        },
        "case 2: intArrayOf(1, 1), intArrayOf(2, 2)" to {
            expect(-1, Solution().canCompleteCircuit(intArrayOf(1, 1), intArrayOf(2, 2)))
        },
        "case 3: intArrayOf(5), intArrayOf(4)" to {
            expect(0, Solution().canCompleteCircuit(intArrayOf(5), intArrayOf(4)))
        },
    )
}
