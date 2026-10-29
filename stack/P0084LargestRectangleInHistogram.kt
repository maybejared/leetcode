// 84. Largest Rectangle In Histogram — Hard
// https://leetcode.com/problems/largest-rectangle-in-histogram/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0084

import practice.*

class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        TODO("Implement largestRectangleArea")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(3, 1, 3, 3)" to {
            expect(6, Solution().largestRectangleArea(intArrayOf(3, 1, 3, 3)))
        },
        "case 2: intArrayOf(2, 2, 2)" to {
            expect(6, Solution().largestRectangleArea(intArrayOf(2, 2, 2)))
        },
        "case 3: intArrayOf(0)" to {
            expect(0, Solution().largestRectangleArea(intArrayOf(0)))
        },
    )
}
