// 35. Search Insert Position — Easy
// https://leetcode.com/problems/search-insert-position/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0035

import practice.*

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        TODO("Implement searchInsert")
    }
}

fun main() {
    runTests(
        "found" to {
            expect(2, Solution().searchInsert(intArrayOf(1, 3, 5, 6), 5))
        },
        "between" to {
            expect(1, Solution().searchInsert(intArrayOf(1, 3, 5, 6), 2))
        },
        "after end" to {
            expect(4, Solution().searchInsert(intArrayOf(1, 3, 5, 6), 7))
        },
        "before start" to {
            expect(0, Solution().searchInsert(intArrayOf(1), 0))
        },
    )
}
