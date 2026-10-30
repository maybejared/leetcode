// 268. Missing Number — Easy
// https://leetcode.com/problems/missing-number/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0268

import practice.*

class Solution {
    fun missingNumber(nums: IntArray): Int {
        TODO("Implement missingNumber")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(4, 0, 1, 3)" to {
            expect(2, Solution().missingNumber(intArrayOf(4, 0, 1, 3)))
        },
        "case 2: intArrayOf(1)" to {
            expect(0, Solution().missingNumber(intArrayOf(1)))
        },
        "case 3: intArrayOf(0, 1)" to {
            expect(2, Solution().missingNumber(intArrayOf(0, 1)))
        },
    )
}
