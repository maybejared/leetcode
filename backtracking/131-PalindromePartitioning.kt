// 131. Palindrome Partitioning — Medium
// https://leetcode.com/problems/palindrome-partitioning/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0131

import practice.*

class Solution {
    fun partition(s: String): List<List<String>> {
        TODO("Implement partition")
    }
}

fun main() {
    runTests(
        "case 1: \"aba\"" to {
            expectUnordered(listOf(listOf("a", "b", "a"), listOf("aba")), Solution().partition("aba"))
        },
        "case 2: \"aa\"" to {
            expectUnordered(listOf(listOf("a", "a"), listOf("aa")), Solution().partition("aa"))
        },
        "case 3: \"ab\"" to {
            expectUnordered(listOf(listOf("a", "b")), Solution().partition("ab"))
        },
    )
}
