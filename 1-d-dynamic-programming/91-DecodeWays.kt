// 91. Decode Ways — Medium
// https://leetcode.com/problems/decode-ways/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0091

import practice.*

class Solution {
    fun numDecodings(s: String): Int {
        TODO("Implement numDecodings")
    }
}

fun main() {
    runTests(
        "case 1: \"121\"" to {
            expect(3, Solution().numDecodings("121"))
        },
        "case 2: \"06\"" to {
            expect(0, Solution().numDecodings("06"))
        },
        "case 3: \"2101\"" to {
            expect(1, Solution().numDecodings("2101"))
        },
        "case 4: \"0\"" to {
            expect(0, Solution().numDecodings("0"))
        },
    )
}
