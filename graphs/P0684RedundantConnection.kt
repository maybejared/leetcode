// 684. Redundant Connection — Medium
// https://leetcode.com/problems/redundant-connection/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0684

import practice.*

class Solution {
    fun findRedundantConnection(edges: Array<IntArray>): IntArray {
        TODO("Implement findRedundantConnection")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(1, 3))" to {
            expect(intArrayOf(1, 3), Solution().findRedundantConnection(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(1, 3))))
        },
        "case 2: arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 4))" to {
            expect(intArrayOf(1, 4), Solution().findRedundantConnection(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 4))))
        },
        "case 3: arrayOf(intArrayOf(1, 3), intArrayOf(1, 2), intArrayOf(2, 3))" to {
            expect(intArrayOf(2, 3), Solution().findRedundantConnection(arrayOf(intArrayOf(1, 3), intArrayOf(1, 2), intArrayOf(2, 3))))
        },
    )
}
