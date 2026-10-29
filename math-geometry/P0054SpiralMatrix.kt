// 54. Spiral Matrix — Medium
// https://leetcode.com/problems/spiral-matrix/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0054

import practice.*

class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        TODO("Implement spiralOrder")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))" to {
            expect(listOf(1, 2, 3, 6, 5, 4), Solution().spiralOrder(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))))
        },
        "case 2: arrayOf(intArrayOf(1, 2, 3))" to {
            expect(listOf(1, 2, 3), Solution().spiralOrder(arrayOf(intArrayOf(1, 2, 3))))
        },
        "case 3: arrayOf(intArrayOf(1), intArrayOf(2), intArrayOf(3))" to {
            expect(listOf(1, 2, 3), Solution().spiralOrder(arrayOf(intArrayOf(1), intArrayOf(2), intArrayOf(3))))
        },
    )
}
