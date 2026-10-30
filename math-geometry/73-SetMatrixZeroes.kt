// 73. Set Matrix Zeroes — Medium
// https://leetcode.com/problems/set-matrix-zeroes/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0073

import practice.*

class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        TODO("Implement setZeroes")
    }
}

fun main() {
    runTests(
        "interior zero" to {
            val m = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 0, 6), intArrayOf(7, 8, 9)); Solution().setZeroes(m); expect(arrayOf(intArrayOf(1, 0, 3), intArrayOf(0, 0, 0), intArrayOf(7, 0, 9)), m)
        },
        "first row and column" to {
            val m = arrayOf(intArrayOf(0, 2), intArrayOf(3, 4)); Solution().setZeroes(m); expect(arrayOf(intArrayOf(0, 0), intArrayOf(0, 4)), m)
        },
        "no zeros" to {
            val m = arrayOf(intArrayOf(1, 2)); Solution().setZeroes(m); expect(arrayOf(intArrayOf(1, 2)), m)
        },
    )
}
