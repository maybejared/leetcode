// 46. Permutations — Medium
// https://leetcode.com/problems/permutations/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0046

import practice.*

class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        TODO("Implement permute")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 2)" to {
            expectUnordered(listOf(listOf(1, 2), listOf(2, 1)), Solution().permute(intArrayOf(1, 2)))
        },
        "case 2: intArrayOf(5)" to {
            expectUnordered(listOf(listOf(5)), Solution().permute(intArrayOf(5)))
        },
        "case 3: intArrayOf(-1, 0)" to {
            expectUnordered(listOf(listOf(-1, 0), listOf(0, -1)), Solution().permute(intArrayOf(-1, 0)))
        },
    )
}
