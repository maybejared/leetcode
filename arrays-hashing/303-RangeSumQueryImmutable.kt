// 303. Range Sum Query Immutable — Easy
// https://leetcode.com/problems/range-sum-query-immutable/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0303

import practice.*

class NumArray(nums: IntArray) {
    fun sumRange(left: Int, right: Int): Int {
        TODO("Implement sumRange")
    }
}

fun main() {
    runTests(
        "multiple queries" to {
            val query = NumArray(intArrayOf(-2, 0, 3, -5, 2, -1)); expect(1, query.sumRange(0, 2)); expect(-1, query.sumRange(2, 5)); expect(-3, query.sumRange(0, 5))
        },
        "single element range" to {
            val query = NumArray(intArrayOf(4)); expect(4, query.sumRange(0, 0))
        },
    )
}
