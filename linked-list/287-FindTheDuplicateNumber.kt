// 287. Find The Duplicate Number — Medium
// https://leetcode.com/problems/find-the-duplicate-number/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0287

import practice.*

class Solution {
    fun findDuplicate(nums: IntArray): Int {
        TODO("Implement findDuplicate")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(2, 1, 3, 4, 2)" to {
            expect(2, Solution().findDuplicate(intArrayOf(2, 1, 3, 4, 2)))
        },
        "case 2: intArrayOf(1, 1)" to {
            expect(1, Solution().findDuplicate(intArrayOf(1, 1)))
        },
        "case 3: intArrayOf(3, 3, 3, 3)" to {
            expect(3, Solution().findDuplicate(intArrayOf(3, 3, 3, 3)))
        },
    )
}
