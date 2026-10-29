// 90. Subsets II — Medium
// https://leetcode.com/problems/subsets-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0090

import practice.*

class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        TODO("Implement subsetsWithDup")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 2, 2)" to {
            expectGroups(listOf(emptyList(), listOf(1), listOf(2), listOf(1, 2), listOf(2, 2), listOf(1, 2, 2)), Solution().subsetsWithDup(intArrayOf(1, 2, 2)))
        },
        "case 2: intArrayOf(0, 0)" to {
            expectGroups(listOf(emptyList(), listOf(0), listOf(0, 0)), Solution().subsetsWithDup(intArrayOf(0, 0)))
        },
        "case 3: intArrayOf(4)" to {
            expectGroups(listOf(emptyList(), listOf(4)), Solution().subsetsWithDup(intArrayOf(4)))
        },
    )
}
