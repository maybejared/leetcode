// 1137. N-th Tribonacci Number — Easy
// https://leetcode.com/problems/n-th-tribonacci-number/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1137

import practice.*

class Solution {
    fun tribonacci(n: Int): Int {
        TODO("Implement tribonacci")
    }
}

fun main() {
    runTests(
        "base zero" to {
            expect(0, Solution().tribonacci(0))
        },
        "base one" to {
            expect(1, Solution().tribonacci(1))
        },
        "base two" to {
            expect(1, Solution().tribonacci(2))
        },
        "recurrence" to {
            expect(4, Solution().tribonacci(4)); expect(1389537, Solution().tribonacci(25))
        },
    )
}
