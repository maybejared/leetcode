// 16. 3Sum Closest — Medium
// https://leetcode.com/problems/3sum-closest/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0016

import practice.*

class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        TODO("Implement threeSumClosest")
    }
}

fun main() {
    runTests(
        "closest sum" to {
            expect(2, Solution().threeSumClosest(intArrayOf(-1, 2, 1, -4), 1))
        },
        "zeros" to {
            expect(0, Solution().threeSumClosest(intArrayOf(0, 0, 0), 1))
        },
        "exact match" to {
            expect(6, Solution().threeSumClosest(intArrayOf(1, 2, 3, 8), 6))
        },
    )
}
