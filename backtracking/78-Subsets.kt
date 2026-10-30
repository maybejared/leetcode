// 78. Subsets — Medium
// https://leetcode.com/problems/subsets/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0078

import practice.*

class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        TODO("Implement subsets")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(2, 5)" to {
            expectGroups(listOf(emptyList(), listOf(2), listOf(5), listOf(2, 5)), Solution().subsets(intArrayOf(2, 5)))
        },
        "case 2: intArrayOf(0)" to {
            expectGroups(listOf(emptyList(), listOf(0)), Solution().subsets(intArrayOf(0)))
        },
        "case 3: intArrayOf(-1, 1)" to {
            expectGroups(listOf(emptyList(), listOf(-1), listOf(1), listOf(-1, 1)), Solution().subsets(intArrayOf(-1, 1)))
        },
    )
}
