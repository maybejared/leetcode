// 207. Course Schedule — Medium
// https://leetcode.com/problems/course-schedule/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0207

import practice.*

class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        TODO("Implement canFinish")
    }
}

fun main() {
    runTests(
        "case 1: 3, arrayOf(intArrayOf(1, 0), intArrayOf(2, 1))" to {
            expect(true, Solution().canFinish(3, arrayOf(intArrayOf(1, 0), intArrayOf(2, 1))))
        },
        "case 2: 2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))" to {
            expect(false, Solution().canFinish(2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))))
        },
        "case 3: 4, emptyArray<IntArray>()" to {
            expect(true, Solution().canFinish(4, emptyArray<IntArray>()))
        },
    )
}
