// 130. Surrounded Regions — Medium
// https://leetcode.com/problems/surrounded-regions/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0130

import practice.*

class Solution {
    fun solve(board: Array<CharArray>): Unit {
        TODO("Implement solve")
    }
}

fun main() {
    runTests(
        "enclosed region" to {
            val b = chars("XXXX", "XOOX", "XXOX", "XOXX"); Solution().solve(b); expect(chars("XXXX", "XXXX", "XXXX", "XOXX"), b)
        },
        "border connection" to {
            val b = chars("OOO", "OXO", "OOO"); Solution().solve(b); expect(chars("OOO", "OXO", "OOO"), b)
        },
        "single cell" to {
            val b = chars("O"); Solution().solve(b); expect(chars("O"), b)
        },
    )
}
