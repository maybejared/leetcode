// 191. Number of 1 Bits — Easy
// https://leetcode.com/problems/number-of-1-bits/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0191

import practice.*

class Solution {
    fun hammingWeight(n: Int): Int {
        TODO("Implement hammingWeight")
    }
}

fun main() {
    runTests(
        "case 1: 13" to {
            expect(3, Solution().hammingWeight(13))
        },
        "case 2: 1" to {
            expect(1, Solution().hammingWeight(1))
        },
        "case 3: Int.MAX_VALUE" to {
            expect(31, Solution().hammingWeight(Int.MAX_VALUE))
        },
    )
}
