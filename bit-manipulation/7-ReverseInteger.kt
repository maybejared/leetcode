// 7. Reverse Integer — Medium
// https://leetcode.com/problems/reverse-integer/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0007

import practice.*

class Solution {
    fun reverse(x: Int): Int {
        TODO("Implement reverse")
    }
}

fun main() {
    runTests(
        "case 1: 120" to {
            expect(21, Solution().reverse(120))
        },
        "case 2: -456" to {
            expect(-654, Solution().reverse(-456))
        },
        "case 3: 1534236469" to {
            expect(0, Solution().reverse(1534236469))
        },
        "case 4: Int.MIN_VALUE" to {
            expect(0, Solution().reverse(Int.MIN_VALUE))
        },
    )
}
