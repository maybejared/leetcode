// 11. Container With Most Water — Medium
// https://leetcode.com/problems/container-with-most-water/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0011

import practice.*

class Solution {
    fun maxArea(height: IntArray): Int {
        TODO("Implement maxArea")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(3, 1, 2, 4, 5)" to {
            expect(12, Solution().maxArea(intArrayOf(3, 1, 2, 4, 5)))
        },
        "case 2: intArrayOf(2, 2)" to {
            expect(2, Solution().maxArea(intArrayOf(2, 2)))
        },
        "case 3: intArrayOf(1, 1, 1, 1)" to {
            expect(3, Solution().maxArea(intArrayOf(1, 1, 1, 1)))
        },
    )
}
