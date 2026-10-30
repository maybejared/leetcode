// 216. Combination Sum III — Medium
// https://leetcode.com/problems/combination-sum-iii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0216

import practice.*

class Solution {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        TODO("Implement combinationSum3")
    }
}

fun main() {
    runTests(
        "one combination" to {
            expectGroups(listOf(listOf(1, 2, 4)), Solution().combinationSum3(3, 7))
        },
        "multiple combinations" to {
            expectGroups(listOf(listOf(1, 2, 6), listOf(1, 3, 5), listOf(2, 3, 4)), Solution().combinationSum3(3, 9))
        },
        "impossible" to {
            expectGroups(emptyList<List<Int>>(), Solution().combinationSum3(4, 1))
        },
    )
}
