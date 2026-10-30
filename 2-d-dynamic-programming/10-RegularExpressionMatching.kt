// 10. Regular Expression Matching — Hard
// https://leetcode.com/problems/regular-expression-matching/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0010

import practice.*

class Solution {
    fun isMatch(s: String, p: String): Boolean {
        TODO("Implement isMatch")
    }
}

fun main() {
    runTests(
        "case 1: \"aab\", \"c*a*b\"" to {
            expect(true, Solution().isMatch("aab", "c*a*b"))
        },
        "case 2: \"abc\", \".*\"" to {
            expect(true, Solution().isMatch("abc", ".*"))
        },
        "case 3: \"ab\", \".*c\"" to {
            expect(false, Solution().isMatch("ab", ".*c"))
        },
        "case 4: \"aaa\", \"a\"" to {
            expect(false, Solution().isMatch("aaa", "a"))
        },
    )
}
