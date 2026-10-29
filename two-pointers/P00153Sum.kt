// 15. 3Sum — Medium
// https://leetcode.com/problems/3sum/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0015

import practice.*

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        TODO("Implement threeSum")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(-2, 0, 1, 1, 2)" to {
            expectGroups(listOf(listOf(-2, 0, 2), listOf(-2, 1, 1)), Solution().threeSum(intArrayOf(-2, 0, 1, 1, 2)))
        },
        "case 2: intArrayOf(0, 0, 0, 0)" to {
            expectGroups(listOf(listOf(0, 0, 0)), Solution().threeSum(intArrayOf(0, 0, 0, 0)))
        },
        "case 3: intArrayOf(1, 2, 3)" to {
            expectGroups(emptyList<List<Int>>(), Solution().threeSum(intArrayOf(1, 2, 3)))
        },
    )
}
