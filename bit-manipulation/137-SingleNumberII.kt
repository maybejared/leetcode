// 137. Single Number II — Medium
// https://leetcode.com/problems/single-number-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0137

import practice.*

class Solution {
    fun singleNumber(nums: IntArray): Int {
        TODO("Implement singleNumber")
    }
}

fun main() {
    runTests(
        "triplicate values" to {
            expect(3, Solution().singleNumber(intArrayOf(2, 2, 3, 2)))
        },
        "multiple groups" to {
            expect(99, Solution().singleNumber(intArrayOf(0, 1, 0, 1, 0, 1, 99)))
        },
        "negative unique value" to {
            expect(-7, Solution().singleNumber(intArrayOf(-2, -2, -2, -7)))
        },
    )
}
