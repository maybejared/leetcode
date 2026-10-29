// 17. Letter Combinations of a Phone Number — Medium
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0017

import practice.*

class Solution {
    fun letterCombinations(digits: String): List<String> {
        TODO("Implement letterCombinations")
    }
}

fun main() {
    runTests(
        "case 1: \"24\"" to {
            expectUnordered(listOf("ag", "ah", "ai", "bg", "bh", "bi", "cg", "ch", "ci"), Solution().letterCombinations("24"))
        },
        "case 2: \"\"" to {
            expectUnordered(emptyList<String>(), Solution().letterCombinations(""))
        },
        "case 3: \"7\"" to {
            expectUnordered(listOf("p", "q", "r", "s"), Solution().letterCombinations("7"))
        },
    )
}
