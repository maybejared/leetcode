// 77. Combinations — Medium
// https://leetcode.com/problems/combinations/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0077

import practice.*

class Solution {
    fun combine(n: Int, k: Int): List<List<Int>> {
        TODO("Implement combine")
    }
}

fun main() {
    runTests(
        "choose two" to {
            expectGroups(listOf(listOf(1, 2), listOf(1, 3), listOf(1, 4), listOf(2, 3), listOf(2, 4), listOf(3, 4)), Solution().combine(4, 2))
        },
        "choose all" to {
            expectGroups(listOf(listOf(1, 2, 3)), Solution().combine(3, 3))
        },
        "singleton" to {
            expectGroups(listOf(listOf(1)), Solution().combine(1, 1))
        },
    )
}
