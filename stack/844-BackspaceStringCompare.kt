// 844. Backspace String Compare — Easy
// https://leetcode.com/problems/backspace-string-compare/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0844

import practice.*

class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        TODO("Implement backspaceCompare")
    }
}

fun main() {
    runTests(
        "same result" to {
            expect(true, Solution().backspaceCompare("ab#c", "ad#c"))
        },
        "empty results" to {
            expect(true, Solution().backspaceCompare("ab##", "c#d#"))
        },
        "different result" to {
            expect(false, Solution().backspaceCompare("a#c", "b"))
        },
        "leading backspaces" to {
            expect(true, Solution().backspaceCompare("###a", "a"))
        },
    )
}
