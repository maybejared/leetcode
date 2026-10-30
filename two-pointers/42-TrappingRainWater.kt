// 42. Trapping Rain Water — Hard
// https://leetcode.com/problems/trapping-rain-water/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0042

import practice.*

class Solution {
    fun trap(height: IntArray): Int {
        TODO("Implement trap")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(3, 0, 2, 0, 4)" to {
            expect(7, Solution().trap(intArrayOf(3, 0, 2, 0, 4)))
        },
        "case 2: intArrayOf(1, 2, 3, 4)" to {
            expect(0, Solution().trap(intArrayOf(1, 2, 3, 4)))
        },
        "case 3: intArrayOf(2, 0, 2)" to {
            expect(2, Solution().trap(intArrayOf(2, 0, 2)))
        },
    )
}
