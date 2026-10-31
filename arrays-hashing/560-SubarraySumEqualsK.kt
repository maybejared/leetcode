// 560. Subarray Sum Equals K — Medium
// https://leetcode.com/problems/subarray-sum-equals-k/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0560

import practice.*

class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        // Prefix Summing -> Add a left most 0 to represent start of sequence
        val frequency = mutableMapOf(0 to 1)
        var prefix = 0
        var count = 0
        nums.forEach {
            // Append count of current prefix 
            prefix += it
            // Find if prior subset is applicable to k & get all counts
            count += frequency.getOrDefault(prefix - k, 0)
            // Add current position to map so it can be located during future iterations
            frequency[prefix] = frequency.getOrDefault(prefix, 0) + 1
        }

        return count
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
