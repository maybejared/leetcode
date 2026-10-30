// 643. Maximum Average Subarray I — Easy
// https://leetcode.com/problems/maximum-average-subarray-i/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0643

import practice.*

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        TODO("Implement findMaxAverage")
    }
}

fun main() {
    runTests(
        "mixed values" to {
            expectNear(12.75, Solution().findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4))
        },
        "singleton" to {
            expectNear(5.0, Solution().findMaxAverage(intArrayOf(5), 1))
        },
        "negative values" to {
            expectNear(-2.5, Solution().findMaxAverage(intArrayOf(-4, -2, -3), 2))
        },
    )
}
