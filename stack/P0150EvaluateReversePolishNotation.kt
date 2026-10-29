// 150. Evaluate Reverse Polish Notation — Medium
// https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0150

import practice.*

class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        TODO("Implement evalRPN")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(\"4\", \"3\", \"+\", \"2\", \"*\")" to {
            expect(14, Solution().evalRPN(arrayOf("4", "3", "+", "2", "*")))
        },
        "case 2: arrayOf(\"7\", \"-3\", \"/\")" to {
            expect(-2, Solution().evalRPN(arrayOf("7", "-3", "/")))
        },
        "case 3: arrayOf(\"5\")" to {
            expect(5, Solution().evalRPN(arrayOf("5")))
        },
    )
}
