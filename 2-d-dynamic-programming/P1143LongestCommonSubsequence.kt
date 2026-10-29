// 1143. Longest Common Subsequence — Medium
// https://leetcode.com/problems/longest-common-subsequence/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1143

import practice.*

class Solution {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        TODO("Implement longestCommonSubsequence")
    }
}

fun main() {
    runTests(
        "case 1: \"axbycz\", \"abc\"" to {
            expect(3, Solution().longestCommonSubsequence("axbycz", "abc"))
        },
        "case 2: \"abc\", \"xyz\"" to {
            expect(0, Solution().longestCommonSubsequence("abc", "xyz"))
        },
        "case 3: \"aaaa\", \"aa\"" to {
            expect(2, Solution().longestCommonSubsequence("aaaa", "aa"))
        },
    )
}
