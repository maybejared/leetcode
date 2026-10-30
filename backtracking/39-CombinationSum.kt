// 39. Combination Sum — Medium
// https://leetcode.com/problems/combination-sum/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0039

import practice.*

class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        TODO("Implement combinationSum")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(2, 3, 5), 7" to {
            expectGroups(listOf(listOf(2, 2, 3), listOf(2, 5)), Solution().combinationSum(intArrayOf(2, 3, 5), 7))
        },
        "case 2: intArrayOf(4, 6), 5" to {
            expectGroups(emptyList<List<Int>>(), Solution().combinationSum(intArrayOf(4, 6), 5))
        },
        "case 3: intArrayOf(3), 9" to {
            expectGroups(listOf(listOf(3, 3, 3)), Solution().combinationSum(intArrayOf(3), 9))
        },
    )
}
