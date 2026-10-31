// 724. Find Pivot Index — Easy
// https://leetcode.com/problems/find-pivot-index/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0724

import practice.*

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val prefix = IntArray(nums.size + 1) { 0 }
        nums.forEachIndexed { i: Int, value: Int ->
            prefix[i + 1] = prefix[i] + value
        }

        prefix.forEachIndexed { i: Int, value: Int ->
            if (i == 0) return@forEachIndexed
            val prev = prefix[i - 1]
            val end = prefix[prefix.lastIndex]
            if (prev == end - value) {
                return i - 1
            }
        }
        return -1
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
