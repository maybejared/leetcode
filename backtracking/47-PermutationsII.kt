// 47. Permutations II — Medium
// https://leetcode.com/problems/permutations-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0047

import practice.*

class Solution {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        TODO("Implement permuteUnique")
    }
}

fun main() {
    runTests(
        "duplicate input" to {
            expectUnordered(listOf(listOf(1, 1, 2), listOf(1, 2, 1), listOf(2, 1, 1)), Solution().permuteUnique(intArrayOf(1, 1, 2)))
        },
        "all equal" to {
            expectUnordered(listOf(listOf(2, 2)), Solution().permuteUnique(intArrayOf(2, 2)))
        },
        "distinct input" to {
            expectUnordered(listOf(listOf(1, 2), listOf(2, 1)), Solution().permuteUnique(intArrayOf(1, 2)))
        },
    )
}
