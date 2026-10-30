// 70. Climbing Stairs — Easy
// https://leetcode.com/problems/climbing-stairs/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0070

import practice.*

class Solution {
    fun climbStairs(n: Int): Int {
        TODO("Implement climbStairs")
    }
}

fun main() {
    runTests(
        "case 1: 1" to {
            expect(1, Solution().climbStairs(1))
        },
        "case 2: 4" to {
            expect(5, Solution().climbStairs(4))
        },
        "case 3: 6" to {
            expect(13, Solution().climbStairs(6))
        },
    )
}
