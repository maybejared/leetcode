// 424. Longest Repeating Character Replacement — Medium
// https://leetcode.com/problems/longest-repeating-character-replacement/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0424

import practice.*

class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        TODO("Implement characterReplacement")
    }
}

fun main() {
    runTests(
        "case 1: \"ABBBAC\", 1" to {
            expect(4, Solution().characterReplacement("ABBBAC", 1))
        },
        "case 2: \"ABAB\", 0" to {
            expect(1, Solution().characterReplacement("ABAB", 0))
        },
        "case 3: \"AAAA\", 2" to {
            expect(4, Solution().characterReplacement("AAAA", 2))
        },
    )
}
