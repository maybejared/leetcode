// 79. Word Search — Medium
// https://leetcode.com/problems/word-search/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0079

import practice.*

class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        TODO("Implement exist")
    }
}

fun main() {
    runTests(
        "case 1: chars(\"AB\", \"CD\"), \"ABD\"" to {
            expect(true, Solution().exist(chars("AB", "CD"), "ABD"))
        },
        "case 2: chars(\"AB\", \"CD\"), \"ABA\"" to {
            expect(false, Solution().exist(chars("AB", "CD"), "ABA"))
        },
        "case 3: chars(\"X\"), \"X\"" to {
            expect(true, Solution().exist(chars("X"), "X"))
        },
    )
}
