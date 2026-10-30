// 560. Subarray Sum Equals K — Medium
// https://leetcode.com/problems/subarray-sum-equals-k/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0560

import practice.*

class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        TODO("Implement subarraySum")
    }
}

fun main() {
    runTests(
        "overlapping subarrays" to {
            expect(2, Solution().subarraySum(intArrayOf(1, 1, 1), 2))
        },
        "zero sums" to {
            expect(3, Solution().subarraySum(intArrayOf(1, -1, 0), 0))
        },
        "all zeros" to {
            expect(6, Solution().subarraySum(intArrayOf(0, 0, 0), 0))
        },
    )
}
