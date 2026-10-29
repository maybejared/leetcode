// 743. Network Delay Time — Medium
// https://leetcode.com/problems/network-delay-time/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0743

import practice.*

class Solution {
    fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {
        TODO("Implement networkDelayTime")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 2, 3), intArrayOf(1, 3, 8), intArrayOf(2, 3, 2)), 3, 1" to {
            expect(5, Solution().networkDelayTime(arrayOf(intArrayOf(1, 2, 3), intArrayOf(1, 3, 8), intArrayOf(2, 3, 2)), 3, 1))
        },
        "case 2: arrayOf(intArrayOf(1, 2, 1)), 3, 1" to {
            expect(-1, Solution().networkDelayTime(arrayOf(intArrayOf(1, 2, 1)), 3, 1))
        },
        "case 3: arrayOf(intArrayOf(1, 2, 1)), 2, 2" to {
            expect(-1, Solution().networkDelayTime(arrayOf(intArrayOf(1, 2, 1)), 2, 2))
        },
    )
}
