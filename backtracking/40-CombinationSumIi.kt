// 40. Combination Sum II — Medium
// https://leetcode.com/problems/combination-sum-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0040

import practice.*

class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        TODO("Implement combinationSum2")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 1, 2, 3), 4" to {
            expectGroups(listOf(listOf(1, 1, 2), listOf(1, 3)), Solution().combinationSum2(intArrayOf(1, 1, 2, 3), 4))
        },
        "case 2: intArrayOf(2, 2, 2), 4" to {
            expectGroups(listOf(listOf(2, 2)), Solution().combinationSum2(intArrayOf(2, 2, 2), 4))
        },
        "case 3: intArrayOf(3), 6" to {
            expectGroups(emptyList<List<Int>>(), Solution().combinationSum2(intArrayOf(3), 6))
        },
    )
}
