// 201. Bitwise AND of Numbers Range — Medium
// https://leetcode.com/problems/bitwise-and-of-numbers-range/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0201

import practice.*

class Solution {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        TODO("Implement rangeBitwiseAnd")
    }
}

fun main() {
    runTests(
        "shared prefix" to {
            expect(4, Solution().rangeBitwiseAnd(5, 7))
        },
        "zero range" to {
            expect(0, Solution().rangeBitwiseAnd(0, 0))
        },
        "large range" to {
            expect(0, Solution().rangeBitwiseAnd(1, Int.MAX_VALUE))
        },
        "singleton" to {
            expect(12, Solution().rangeBitwiseAnd(12, 12))
        },
    )
}
