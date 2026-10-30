// 704. Binary Search — Easy
// https://leetcode.com/problems/binary-search/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0704

import practice.*

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        TODO("Implement search")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(-4, 0, 3, 8), 3" to {
            expect(2, Solution().search(intArrayOf(-4, 0, 3, 8), 3))
        },
        "case 2: intArrayOf(-4, 0, 3, 8), 5" to {
            expect(-1, Solution().search(intArrayOf(-4, 0, 3, 8), 5))
        },
        "case 3: intArrayOf(2), 2" to {
            expect(0, Solution().search(intArrayOf(2), 2))
        },
    )
}
