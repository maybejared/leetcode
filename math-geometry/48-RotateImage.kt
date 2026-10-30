// 48. Rotate Image — Medium
// https://leetcode.com/problems/rotate-image/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0048

import practice.*

class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        TODO("Implement rotate")
    }
}

fun main() {
    runTests(
        "two by two" to {
            val m = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)); Solution().rotate(m); expect(arrayOf(intArrayOf(3, 1), intArrayOf(4, 2)), m)
        },
        "three by three" to {
            val m = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)); Solution().rotate(m); expect(arrayOf(intArrayOf(7, 4, 1), intArrayOf(8, 5, 2), intArrayOf(9, 6, 3)), m)
        },
        "singleton" to {
            val m = arrayOf(intArrayOf(5)); Solution().rotate(m); expect(arrayOf(intArrayOf(5)), m)
        },
    )
}
