// 2013. Detect Squares — Medium
// https://leetcode.com/problems/detect-squares/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p2013

import practice.*

class DetectSquares {
    fun add(point: IntArray): Unit {
        TODO("Implement add")
    }

    fun count(point: IntArray): Int {
        TODO("Implement count")
    }
}

fun main() {
    runTests(
        "square and duplicates" to {
            val d = DetectSquares(); d.add(intArrayOf(0, 1)); d.add(intArrayOf(1, 0)); d.add(intArrayOf(1, 1)); expect(1, d.count(intArrayOf(0, 0))); d.add(intArrayOf(1, 1)); expect(2, d.count(intArrayOf(0, 0)))
        },
        "no square" to {
            val d = DetectSquares(); d.add(intArrayOf(1, 1)); expect(0, d.count(intArrayOf(0, 0)))
        },
        "query point does not multiply count" to {
            val d = DetectSquares(); listOf(intArrayOf(0, 0), intArrayOf(0, 0), intArrayOf(0, 2), intArrayOf(2, 0), intArrayOf(2, 2)).forEach(d::add); expect(1, d.count(intArrayOf(0, 0)))
        },
    )
}
