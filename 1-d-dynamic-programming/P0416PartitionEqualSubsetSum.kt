// 416. Partition Equal Subset Sum — Medium
// https://leetcode.com/problems/partition-equal-subset-sum/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0416

import practice.*

class Solution {
    fun canPartition(nums: IntArray): Boolean {
        TODO("Implement canPartition")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(2, 2, 3, 5)" to {
            expect(false, Solution().canPartition(intArrayOf(2, 2, 3, 5)))
        },
        "case 2: intArrayOf(1, 2, 3, 4)" to {
            expect(true, Solution().canPartition(intArrayOf(1, 2, 3, 4)))
        },
        "case 3: intArrayOf(1, 2)" to {
            expect(false, Solution().canPartition(intArrayOf(1, 2)))
        },
    )
}
