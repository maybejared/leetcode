// 739. Daily Temperatures — Medium
// https://leetcode.com/problems/daily-temperatures/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0739

import practice.*

class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        TODO("Implement dailyTemperatures")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(60, 62, 61, 65)" to {
            expect(intArrayOf(1, 2, 1, 0), Solution().dailyTemperatures(intArrayOf(60, 62, 61, 65)))
        },
        "case 2: intArrayOf(70, 70, 70)" to {
            expect(intArrayOf(0, 0, 0), Solution().dailyTemperatures(intArrayOf(70, 70, 70)))
        },
        "case 3: intArrayOf(80, 75, 60)" to {
            expect(intArrayOf(0, 0, 0), Solution().dailyTemperatures(intArrayOf(80, 75, 60)))
        },
    )
}
