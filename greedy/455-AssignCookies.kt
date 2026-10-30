// 455. Assign Cookies — Easy
// https://leetcode.com/problems/assign-cookies/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0455

import practice.*

class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        TODO("Implement findContentChildren")
    }
}

fun main() {
    runTests(
        "insufficient cookies" to {
            expect(1, Solution().findContentChildren(intArrayOf(1, 2, 3), intArrayOf(1, 1)))
        },
        "enough cookies" to {
            expect(2, Solution().findContentChildren(intArrayOf(1, 2), intArrayOf(1, 2, 3)))
        },
        "empty cookies" to {
            expect(0, Solution().findContentChildren(intArrayOf(1), intArrayOf()))
        },
    )
}
