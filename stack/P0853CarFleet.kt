// 853. Car Fleet — Medium
// https://leetcode.com/problems/car-fleet/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0853

import practice.*

class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        TODO("Implement carFleet")
    }
}

fun main() {
    runTests(
        "case 1: 10, intArrayOf(0, 4), intArrayOf(2, 1)" to {
            expect(1, Solution().carFleet(10, intArrayOf(0, 4), intArrayOf(2, 1)))
        },
        "case 2: 10, intArrayOf(0, 4), intArrayOf(1, 2)" to {
            expect(2, Solution().carFleet(10, intArrayOf(0, 4), intArrayOf(1, 2)))
        },
        "case 3: 10, intArrayOf(8), intArrayOf(3)" to {
            expect(1, Solution().carFleet(10, intArrayOf(8), intArrayOf(3)))
        },
    )
}
