// 338. Counting Bits — Easy
// https://leetcode.com/problems/counting-bits/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0338

import practice.*

class Solution {
    fun countBits(n: Int): IntArray {
        TODO("Implement countBits")
    }
}

fun main() {
    runTests(
        "case 1: 4" to {
            expect(intArrayOf(0, 1, 1, 2, 1), Solution().countBits(4))
        },
        "case 2: 0" to {
            expect(intArrayOf(0), Solution().countBits(0))
        },
        "case 3: 1" to {
            expect(intArrayOf(0, 1), Solution().countBits(1))
        },
    )
}
