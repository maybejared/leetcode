// 128. Longest Consecutive Sequence — Medium
// https://leetcode.com/problems/longest-consecutive-sequence/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0128

import practice.*

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        TODO("Implement longestConsecutive")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(9, 4, 6, 5, 20)" to {
            expect(3, Solution().longestConsecutive(intArrayOf(9, 4, 6, 5, 20)))
        },
        "case 2: intArrayOf(2, 2, 1, 3)" to {
            expect(3, Solution().longestConsecutive(intArrayOf(2, 2, 1, 3)))
        },
        "case 3: intArrayOf()" to {
            expect(0, Solution().longestConsecutive(intArrayOf()))
        },
        "case 4: intArrayOf(-2, -1, 0, 5)" to {
            expect(3, Solution().longestConsecutive(intArrayOf(-2, -1, 0, 5)))
        },
    )
}
