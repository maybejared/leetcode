// 66. Plus One — Easy
// https://leetcode.com/problems/plus-one/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0066

import practice.*

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        TODO("Implement plusOne")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 2, 9)" to {
            expect(intArrayOf(1, 3, 0), Solution().plusOne(intArrayOf(1, 2, 9)))
        },
        "case 2: intArrayOf(9, 9)" to {
            expect(intArrayOf(1, 0, 0), Solution().plusOne(intArrayOf(9, 9)))
        },
        "case 3: intArrayOf(0)" to {
            expect(intArrayOf(1), Solution().plusOne(intArrayOf(0)))
        },
    )
}
