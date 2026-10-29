// 846. Hand of Straights — Medium
// https://leetcode.com/problems/hand-of-straights/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0846

import practice.*

class Solution {
    fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
        TODO("Implement isNStraightHand")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 2, 2, 3, 3, 4), 3" to {
            expect(true, Solution().isNStraightHand(intArrayOf(1, 2, 2, 3, 3, 4), 3))
        },
        "case 2: intArrayOf(1, 2, 3, 5, 6, 8), 3" to {
            expect(false, Solution().isNStraightHand(intArrayOf(1, 2, 3, 5, 6, 8), 3))
        },
        "case 3: intArrayOf(9, 9), 1" to {
            expect(true, Solution().isNStraightHand(intArrayOf(9, 9), 1))
        },
    )
}
