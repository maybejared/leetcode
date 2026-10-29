// 202. Happy Number — Easy
// https://leetcode.com/problems/happy-number/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0202

import practice.*

class Solution {
    fun isHappy(n: Int): Boolean {
        TODO("Implement isHappy")
    }
}

fun main() {
    runTests(
        "case 1: 7" to {
            expect(true, Solution().isHappy(7))
        },
        "case 2: 2" to {
            expect(false, Solution().isHappy(2))
        },
        "case 3: 1" to {
            expect(true, Solution().isHappy(1))
        },
    )
}
