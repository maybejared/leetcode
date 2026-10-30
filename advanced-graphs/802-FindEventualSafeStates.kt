// 802. Find Eventual Safe States — Medium
// https://leetcode.com/problems/find-eventual-safe-states/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0802

import practice.*

class Solution {
    fun eventualSafeNodes(graph: Array<IntArray>): List<Int> {
        TODO("Implement eventualSafeNodes")
    }
}

fun main() {
    runTests(
        "cycle and safe branches" to {
            expect(listOf(2, 4, 5, 6), Solution().eventualSafeNodes(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(5), intArrayOf(0), intArrayOf(5), intArrayOf(), intArrayOf())))
        },
        "self cycle" to {
            expect(emptyList<Int>(), Solution().eventualSafeNodes(arrayOf(intArrayOf(0))))
        },
        "all terminal" to {
            expect(listOf(0, 1), Solution().eventualSafeNodes(arrayOf(intArrayOf(), intArrayOf())))
        },
    )
}
