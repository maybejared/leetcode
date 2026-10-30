// 169. Majority Element — Easy
// https://leetcode.com/problems/majority-element/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0169

import practice.*

class Solution {
    fun majorityElement(nums: IntArray): Int {
        TODO("Implement majorityElement")
    }
}

fun main() {
    runTests(
        "majority at end" to {
            expect(3, Solution().majorityElement(intArrayOf(3, 2, 3)))
        },
        "mixed values" to {
            expect(2, Solution().majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
        },
        "singleton" to {
            expect(-1, Solution().majorityElement(intArrayOf(-1)))
        },
    )
}
