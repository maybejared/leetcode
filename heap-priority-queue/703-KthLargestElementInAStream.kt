// 703. Kth Largest Element In a Stream — Easy
// https://leetcode.com/problems/kth-largest-element-in-a-stream/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0703

import practice.*

class KthLargest(k: Int, nums: IntArray) {
    fun add(`val`: Int): Int {
        TODO("Implement add")
    }
}

fun main() {
    runTests(
        "stream" to {
            val s = KthLargest(3, intArrayOf(5, 2, 8)); expect(2, s.add(1)); expect(5, s.add(9)); expect(8, s.add(10))
        },
        "empty initial stream" to {
            val s = KthLargest(1, intArrayOf()); expect(-4, s.add(-4)); expect(2, s.add(2)); expect(2, s.add(1))
        },
        "duplicates" to {
            val s = KthLargest(2, intArrayOf(3, 3)); expect(3, s.add(3)); expect(3, s.add(4))
        },
    )
}
