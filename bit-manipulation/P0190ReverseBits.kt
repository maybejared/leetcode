// 190. Reverse Bits — Easy
// https://leetcode.com/problems/reverse-bits/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0190

import practice.*

class Solution {
    fun reverseBits(n: Int): Int {
        TODO("Implement reverseBits")
    }
}

fun main() {
    runTests(
        "case 1: 1" to {
            expect(Int.MIN_VALUE, Solution().reverseBits(1))
        },
        "case 2: 0" to {
            expect(0, Solution().reverseBits(0))
        },
        "case 3: -1" to {
            expect(-1, Solution().reverseBits(-1))
        },
        "case 4: Int.MIN_VALUE" to {
            expect(1, Solution().reverseBits(Int.MIN_VALUE))
        },
    )
}
