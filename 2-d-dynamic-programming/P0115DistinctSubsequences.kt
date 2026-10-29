// 115. Distinct Subsequences — Hard
// https://leetcode.com/problems/distinct-subsequences/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0115

import practice.*

class Solution {
    fun numDistinct(s: String, t: String): Int {
        TODO("Implement numDistinct")
    }
}

fun main() {
    runTests(
        "case 1: \"ababa\", \"aba\"" to {
            expect(4, Solution().numDistinct("ababa", "aba"))
        },
        "case 2: \"aaaa\", \"aa\"" to {
            expect(6, Solution().numDistinct("aaaa", "aa"))
        },
        "case 3: \"abc\", \"abcd\"" to {
            expect(0, Solution().numDistinct("abc", "abcd"))
        },
    )
}
