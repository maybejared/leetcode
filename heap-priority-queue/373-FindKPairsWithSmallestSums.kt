// 373. Find K Pairs with Smallest Sums — Medium
// https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0373

import practice.*

class Solution {
    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
        TODO("Implement kSmallestPairs")
    }
}

fun main() {
    runTests(
        "three smallest" to {
            expectUnordered(listOf(listOf(1, 2), listOf(1, 4), listOf(1, 6)), Solution().kSmallestPairs(intArrayOf(1, 7, 11), intArrayOf(2, 4, 6), 3))
        },
        "duplicate pairs" to {
            expectUnordered(listOf(listOf(1, 1), listOf(1, 1)), Solution().kSmallestPairs(intArrayOf(1, 1, 2), intArrayOf(1, 2, 3), 2))
        },
        "all pairs requested" to {
            expectUnordered(listOf(listOf(1, 3), listOf(2, 3)), Solution().kSmallestPairs(intArrayOf(1, 2), intArrayOf(3), 2))
        },
    )
}
