// 136. Single Number — Easy
// https://leetcode.com/problems/single-number/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0136

import practice.*

class Solution {
    fun singleNumber(nums: IntArray): Int {
        TODO("Implement singleNumber")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(4, 2, 4, 3, 3)" to {
            expect(2, Solution().singleNumber(intArrayOf(4, 2, 4, 3, 3)))
        },
        "case 2: intArrayOf(-1, 7, -1)" to {
            expect(7, Solution().singleNumber(intArrayOf(-1, 7, -1)))
        },
        "case 3: intArrayOf(0)" to {
            expect(0, Solution().singleNumber(intArrayOf(0)))
        },
    )
}
