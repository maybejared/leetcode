// 1046. Last Stone Weight — Easy
// https://leetcode.com/problems/last-stone-weight/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1046

import practice.*

class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        TODO("Implement lastStoneWeight")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(4, 7, 2)" to {
            expect(1, Solution().lastStoneWeight(intArrayOf(4, 7, 2)))
        },
        "case 2: intArrayOf(5, 5)" to {
            expect(0, Solution().lastStoneWeight(intArrayOf(5, 5)))
        },
        "case 3: intArrayOf(9)" to {
            expect(9, Solution().lastStoneWeight(intArrayOf(9)))
        },
    )
}
