// 1929. Concatenation of Array — Easy
// https://leetcode.com/problems/concatenation-of-array/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1929

import practice.*

class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        TODO("Implement getConcatenation")
    }
}

fun main() {
    runTests(
        "repeated values" to {
            expect(intArrayOf(1, 2, 1, 1, 2, 1), Solution().getConcatenation(intArrayOf(1, 2, 1)))
        },
        "singleton" to {
            expect(intArrayOf(7, 7), Solution().getConcatenation(intArrayOf(7)))
        },
    )
}
