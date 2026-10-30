// 1011. Capacity To Ship Packages Within D Days — Medium
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1011

import practice.*

class Solution {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        TODO("Implement shipWithinDays")
    }
}

fun main() {
    runTests(
        "five days" to {
            expect(15, Solution().shipWithinDays(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
        },
        "three days" to {
            expect(6, Solution().shipWithinDays(intArrayOf(3, 2, 2, 4, 1, 4), 3))
        },
        "one day" to {
            expect(6, Solution().shipWithinDays(intArrayOf(1, 2, 3), 1))
        },
    )
}
