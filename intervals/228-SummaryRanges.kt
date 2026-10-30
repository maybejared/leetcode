// 228. Summary Ranges — Easy
// https://leetcode.com/problems/summary-ranges/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0228

import practice.*

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        TODO("Implement summaryRanges")
    }
}

fun main() {
    runTests(
        "separate ranges" to {
            expect(listOf("0->2", "4->5", "7"), Solution().summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)))
        },
        "empty" to {
            expect(emptyList<String>(), Solution().summaryRanges(intArrayOf()))
        },
        "integer boundaries" to {
            expect(listOf("-2147483648", "2147483647"), Solution().summaryRanges(intArrayOf(Int.MIN_VALUE, Int.MAX_VALUE)))
        },
    )
}
