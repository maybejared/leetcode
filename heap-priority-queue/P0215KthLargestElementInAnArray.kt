// 215. Kth Largest Element In An Array — Medium
// https://leetcode.com/problems/kth-largest-element-in-an-array/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0215

import practice.*

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        TODO("Implement findKthLargest")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(5, 1, 8, 3), 2" to {
            expect(5, Solution().findKthLargest(intArrayOf(5, 1, 8, 3), 2))
        },
        "case 2: intArrayOf(2, 2, 1), 2" to {
            expect(2, Solution().findKthLargest(intArrayOf(2, 2, 1), 2))
        },
        "case 3: intArrayOf(-7), 1" to {
            expect(-7, Solution().findKthLargest(intArrayOf(-7), 1))
        },
    )
}
