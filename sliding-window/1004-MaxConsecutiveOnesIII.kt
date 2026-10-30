// 1004. Max Consecutive Ones III — Medium
// https://leetcode.com/problems/max-consecutive-ones-iii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1004

import practice.*

class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        TODO("Implement longestOnes")
    }
}

fun main() {
    runTests(
        "two flips" to {
            expect(6, Solution().longestOnes(intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0), 2))
        },
        "no flips" to {
            expect(3, Solution().longestOnes(intArrayOf(0, 1, 1, 1, 0), 0))
        },
        "flip all" to {
            expect(3, Solution().longestOnes(intArrayOf(0, 0, 0), 3))
        },
    )
}
