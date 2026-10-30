// 20. Valid Parentheses — Easy
// https://leetcode.com/problems/valid-parentheses/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0020

import practice.*

class Solution {
    fun isValid(s: String): Boolean {
        TODO("Implement isValid")
    }
}

fun main() {
    runTests(
        "case 1: \"{[()]}\"" to {
            expect(true, Solution().isValid("{[()]}"))
        },
        "case 2: \"([)]\"" to {
            expect(false, Solution().isValid("([)]"))
        },
        "case 3: \"(\"" to {
            expect(false, Solution().isValid("("))
        },
        "case 4: \"]\"" to {
            expect(false, Solution().isValid("]"))
        },
    )
}
