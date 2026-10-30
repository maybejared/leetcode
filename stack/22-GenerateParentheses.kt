// 22. Generate Parentheses — Medium
// https://leetcode.com/problems/generate-parentheses/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0022

import practice.*

class Solution {
    fun generateParenthesis(n: Int): List<String> {
        TODO("Implement generateParenthesis")
    }
}

fun main() {
    runTests(
        "case 1: 1" to {
            expectUnordered(listOf("()"), Solution().generateParenthesis(1))
        },
        "case 2: 2" to {
            expectUnordered(listOf("(())", "()()"), Solution().generateParenthesis(2))
        },
        "case 3: 3" to {
            expectUnordered(listOf("((()))", "(()())", "(())()", "()(())", "()()()"), Solution().generateParenthesis(3))
        },
    )
}
