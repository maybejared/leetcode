// 371. Sum of Two Integers — Medium
// https://leetcode.com/problems/sum-of-two-integers/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0371

import practice.*

class Solution {
    fun getSum(a: Int, b: Int): Int {
        TODO("Implement getSum")
    }
}

fun main() {
    runTests(
        "case 1: 7, 5" to {
            expect(12, Solution().getSum(7, 5))
        },
        "case 2: -5, 3" to {
            expect(-2, Solution().getSum(-5, 3))
        },
        "case 3: -4, -6" to {
            expect(-10, Solution().getSum(-4, -6))
        },
        "case 4: 0, 0" to {
            expect(0, Solution().getSum(0, 0))
        },
    )
}
