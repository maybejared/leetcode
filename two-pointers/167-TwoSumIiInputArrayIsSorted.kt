// 167. Two Sum II Input Array Is Sorted — Medium
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0167

import practice.*

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        TODO("Implement twoSum")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(1, 4, 6, 9), 10" to {
            expect(intArrayOf(1, 4), Solution().twoSum(intArrayOf(1, 4, 6, 9), 10))
        },
        "case 2: intArrayOf(2, 2), 4" to {
            expect(intArrayOf(1, 2), Solution().twoSum(intArrayOf(2, 2), 4))
        },
        "case 3: intArrayOf(-5, -1, 3), -2" to {
            expect(intArrayOf(1, 3), Solution().twoSum(intArrayOf(-5, -1, 3), -2))
        },
    )
}
