// 41. First Missing Positive — Hard
// https://leetcode.com/problems/first-missing-positive/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0041

import practice.*

class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        TODO("Implement firstMissingPositive")
    }
}

fun main() {
    runTests(
        "contains zero" to {
            expect(3, Solution().firstMissingPositive(intArrayOf(1, 2, 0)))
        },
        "negative values" to {
            expect(2, Solution().firstMissingPositive(intArrayOf(3, 4, -1, 1)))
        },
        "missing one" to {
            expect(1, Solution().firstMissingPositive(intArrayOf(7, 8, 9, 11, 12)))
        },
        "duplicates" to {
            expect(2, Solution().firstMissingPositive(intArrayOf(1, 1)))
        },
    )
}
