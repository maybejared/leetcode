// 3. Longest Substring Without Repeating Characters — Medium
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0003

import practice.*

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        TODO("Implement lengthOfLongestSubstring")
    }
}

fun main() {
    runTests(
        "case 1: \"abcaef\"" to {
            expect(5, Solution().lengthOfLongestSubstring("abcaef"))
        },
        "case 2: \"zzzz\"" to {
            expect(1, Solution().lengthOfLongestSubstring("zzzz"))
        },
        "case 3: \"\"" to {
            expect(0, Solution().lengthOfLongestSubstring(""))
        },
        "case 4: \"abba\"" to {
            expect(2, Solution().lengthOfLongestSubstring("abba"))
        },
    )
}
