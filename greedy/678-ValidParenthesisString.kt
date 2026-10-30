// 678. Valid Parenthesis String — Medium
// https://leetcode.com/problems/valid-parenthesis-string/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0678

import practice.*

class Solution {
    fun checkValidString(s: String): Boolean {
        TODO("Implement checkValidString")
    }
}

fun main() {
    runTests(
        "case 1: \"(*))\"" to {
            expect(true, Solution().checkValidString("(*))"))
        },
        "case 2: \"(((*)\"" to {
            expect(false, Solution().checkValidString("(((*)"))
        },
        "case 3: \"*\"" to {
            expect(true, Solution().checkValidString("*"))
        },
        "case 4: \")*(\"" to {
            expect(false, Solution().checkValidString(")*("))
        },
    )
}
