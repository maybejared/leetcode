// 1584. Min Cost to Connect All Points — Medium
// https://leetcode.com/problems/min-cost-to-connect-all-points/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1584

import practice.*

class Solution {
    fun minCostConnectPoints(points: Array<IntArray>): Int {
        TODO("Implement minCostConnectPoints")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(0, 0), intArrayOf(2, 0), intArrayOf(2, 3))" to {
            expect(5, Solution().minCostConnectPoints(arrayOf(intArrayOf(0, 0), intArrayOf(2, 0), intArrayOf(2, 3))))
        },
        "case 2: arrayOf(intArrayOf(-1, -1), intArrayOf(1, 1))" to {
            expect(4, Solution().minCostConnectPoints(arrayOf(intArrayOf(-1, -1), intArrayOf(1, 1))))
        },
        "case 3: arrayOf(intArrayOf(7, 7))" to {
            expect(0, Solution().minCostConnectPoints(arrayOf(intArrayOf(7, 7))))
        },
    )
}
