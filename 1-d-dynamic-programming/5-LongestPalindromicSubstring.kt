// 5. Longest Palindromic Substring — Medium
// https://leetcode.com/problems/longest-palindromic-substring/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0005

import practice.*

class Solution {
    fun longestPalindrome(s: String): String {
        TODO("Implement longestPalindrome")
    }
}

fun main() {
    runTests(
        "either tied answer" to {
            val result = Solution().longestPalindrome("babad"); check(result in setOf("bab", "aba")) { "Expected bab or aba, got $result" }
        },
        "even length" to {
            expect("abba", Solution().longestPalindrome("xabbay"))
        },
        "singleton" to {
            expect("q", Solution().longestPalindrome("q"))
        },
    )
}
