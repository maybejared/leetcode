// 286. Walls And Gates — Medium
// https://leetcode.com/problems/walls-and-gates/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0286

import practice.*

class Solution {
    fun wallsAndGates(rooms: Array<IntArray>): Unit {
        TODO("Implement wallsAndGates")
    }
}

fun main() {
    runTests(
        "distance and walls" to {
            val rooms = arrayOf(intArrayOf(0, Int.MAX_VALUE, -1), intArrayOf(Int.MAX_VALUE, Int.MAX_VALUE, Int.MAX_VALUE)); Solution().wallsAndGates(rooms); expect(arrayOf(intArrayOf(0, 1, -1), intArrayOf(1, 2, 3)), rooms)
        },
        "no gates" to {
            val rooms = arrayOf(intArrayOf(Int.MAX_VALUE, -1, Int.MAX_VALUE)); Solution().wallsAndGates(rooms); expect(arrayOf(intArrayOf(Int.MAX_VALUE, -1, Int.MAX_VALUE)), rooms)
        },
        "nearest gate" to {
            val rooms = arrayOf(intArrayOf(0, Int.MAX_VALUE, Int.MAX_VALUE, 0)); Solution().wallsAndGates(rooms); expect(arrayOf(intArrayOf(0, 1, 1, 0)), rooms)
        },
    )
}
