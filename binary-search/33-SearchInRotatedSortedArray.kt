// 33. Search In Rotated Sorted Array — Medium
// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0033

import practice.*

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        TODO("Implement search")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(7, 9, 1, 3, 5), 3" to {
            expect(3, Solution().search(intArrayOf(7, 9, 1, 3, 5), 3))
        },
        "case 2: intArrayOf(7, 9, 1, 3, 5), 4" to {
            expect(-1, Solution().search(intArrayOf(7, 9, 1, 3, 5), 4))
        },
        "case 3: intArrayOf(8), 8" to {
            expect(0, Solution().search(intArrayOf(8), 8))
        },
    )
}
