// 209. Minimum Size Subarray Sum — Medium
// https://leetcode.com/problems/minimum-size-subarray-sum/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0209

import practice.*

class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        TODO("Implement minSubArrayLen")
    }
}

fun main() {
    runTests(
        "shrink window" to {
            expect(2, Solution().minSubArrayLen(7, intArrayOf(2, 3, 1, 2, 4, 3)))
        },
        "single element" to {
            expect(1, Solution().minSubArrayLen(4, intArrayOf(1, 4, 4)))
        },
        "impossible" to {
            expect(0, Solution().minSubArrayLen(11, intArrayOf(1, 1, 1, 1)))
        },
    )
}
