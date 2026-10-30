// 295. Find Median From Data Stream — Hard
// https://leetcode.com/problems/find-median-from-data-stream/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0295

import practice.*

class MedianFinder {
    fun addNum(num: Int): Unit {
        TODO("Implement addNum")
    }

    fun findMedian(): Double {
        TODO("Implement findMedian")
    }
}

fun main() {
    runTests(
        "odd and even" to {
            val m = MedianFinder(); m.addNum(6); expect(6.0, m.findMedian()); m.addNum(2); expect(4.0, m.findMedian()); m.addNum(4); expect(4.0, m.findMedian())
        },
        "negative and duplicate" to {
            val m = MedianFinder(); m.addNum(-3); m.addNum(-3); m.addNum(1); expect(-3.0, m.findMedian()); m.addNum(5); expect(-1.0, m.findMedian())
        },
        "out of order" to {
            val m = MedianFinder(); listOf(9, 1, 7, 3).forEach(m::addNum); expect(5.0, m.findMedian())
        },
    )
}
