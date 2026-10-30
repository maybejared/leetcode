// 210. Course Schedule II — Medium
// https://leetcode.com/problems/course-schedule-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0210

import practice.*

class Solution {
    fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
        TODO("Implement findOrder")
    }
}

fun main() {
    runTests(
        "branching dependencies" to {
            val edges = arrayOf(intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 1), intArrayOf(3, 2)); expectCourseOrder(4, edges, Solution().findOrder(4, edges))
        },
        "cycle" to {
            expect(intArrayOf(), Solution().findOrder(2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))))
        },
        "independent courses" to {
            expectCourseOrder(3, emptyArray(), Solution().findOrder(3, emptyArray()))
        },
    )
}
