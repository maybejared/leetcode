// 45. Jump Game II — Medium
// https://leetcode.com/problems/jump-game-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0045

import practice.*

class Solution {
    fun jump(nums: IntArray): Int {
        TODO("Implement jump")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(2, 3, 1, 1, 4)" to {
            expect(2, Solution().jump(intArrayOf(2, 3, 1, 1, 4)))
        },
        "case 2: intArrayOf(1, 1, 1, 1)" to {
            expect(3, Solution().jump(intArrayOf(1, 1, 1, 1)))
        },
        "case 3: intArrayOf(0)" to {
            expect(0, Solution().jump(intArrayOf(0)))
        },
    )
}
