// 242. Valid Anagram — Easy
// https://leetcode.com/problems/valid-anagram/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0242

import practice.*

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        TODO("Implement isAnagram")
    }
}

fun main() {
    runTests(
        "case 1: \"silent\", \"listen\"" to {
            expect(true, Solution().isAnagram("silent", "listen"))
        },
        "case 2: \"aab\", \"abb\"" to {
            expect(false, Solution().isAnagram("aab", "abb"))
        },
        "case 3: \"ab\", \"a\"" to {
            expect(false, Solution().isAnagram("ab", "a"))
        },
    )
}
