// 724. Find Pivot Index — Easy
// https://leetcode.com/problems/find-pivot-index/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0724

import practice.*

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        TODO("Implement pivotIndex")
    }
}

fun main() {
    runTests(
        "middle pivot" to {
            expect(3, Solution().pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)))
        },
        "no pivot" to {
            expect(-1, Solution().pivotIndex(intArrayOf(1, 2, 3)))
        },
        "first pivot" to {
            expect(0, Solution().pivotIndex(intArrayOf(2, 1, -1)))
        },
    )
}
