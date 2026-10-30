// 55. Jump Game — Medium
// https://leetcode.com/problems/jump-game/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0055

import practice.*

class Solution {
    fun canJump(nums: IntArray): Boolean {
        TODO("Implement canJump")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(2, 0, 1, 0)" to {
            expect(true, Solution().canJump(intArrayOf(2, 0, 1, 0)))
        },
        "case 2: intArrayOf(1, 0, 2)" to {
            expect(false, Solution().canJump(intArrayOf(1, 0, 2)))
        },
        "case 3: intArrayOf(0)" to {
            expect(true, Solution().canJump(intArrayOf(0)))
        },
    )
}
