// 50. Pow(x, n) — Medium
// https://leetcode.com/problems/powx-n/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0050

import practice.*

class Solution {
    fun myPow(x: Double, n: Int): Double {
        TODO("Implement myPow")
    }
}

fun main() {
    runTests(
        "case 1: 2.0, 5" to {
            expectNear(32.0, Solution().myPow(2.0, 5))
        },
        "case 2: 2.0, -3" to {
            expectNear(0.125, Solution().myPow(2.0, -3))
        },
        "case 3: 3.0, 0" to {
            expectNear(1.0, Solution().myPow(3.0, 0))
        },
        "case 4: 1.0, Int.MIN_VALUE" to {
            expectNear(1.0, Solution().myPow(1.0, Int.MIN_VALUE))
        },
    )
}
