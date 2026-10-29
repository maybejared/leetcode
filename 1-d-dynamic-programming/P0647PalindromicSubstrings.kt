// 647. Palindromic Substrings — Medium
// https://leetcode.com/problems/palindromic-substrings/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0647

import practice.*

class Solution {
    fun countSubstrings(s: String): Int {
        TODO("Implement countSubstrings")
    }
}

fun main() {
    runTests(
        "case 1: \"aba\"" to {
            expect(4, Solution().countSubstrings("aba"))
        },
        "case 2: \"aaaa\"" to {
            expect(10, Solution().countSubstrings("aaaa"))
        },
        "case 3: \"xyz\"" to {
            expect(3, Solution().countSubstrings("xyz"))
        },
    )
}
