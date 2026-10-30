// 139. Word Break — Medium
// https://leetcode.com/problems/word-break/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0139

import practice.*

class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        TODO("Implement wordBreak")
    }
}

fun main() {
    runTests(
        "case 1: \"applepieapple\", listOf(\"apple\", \"pie\")" to {
            expect(true, Solution().wordBreak("applepieapple", listOf("apple", "pie")))
        },
        "case 2: \"catsandog\", listOf(\"cats\", \"dog\", \"sand\", \"and\", \"cat\")" to {
            expect(false, Solution().wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")))
        },
        "case 3: \"aaaa\", listOf(\"aa\")" to {
            expect(true, Solution().wordBreak("aaaa", listOf("aa")))
        },
    )
}
