// 59. Spiral Matrix II — Medium
// https://leetcode.com/problems/spiral-matrix-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0059

import practice.*

class Solution {
    fun generateMatrix(n: Int): Array<IntArray> {
        TODO("Implement generateMatrix")
    }
}

fun main() {
    runTests(
        "three by three" to {
            expect(arrayOf(intArrayOf(1, 2, 3), intArrayOf(8, 9, 4), intArrayOf(7, 6, 5)), Solution().generateMatrix(3))
        },
        "single cell" to {
            expect(arrayOf(intArrayOf(1)), Solution().generateMatrix(1))
        },
        "two by two" to {
            expect(arrayOf(intArrayOf(1, 2), intArrayOf(4, 3)), Solution().generateMatrix(2))
        },
    )
}
