// 1. Two Sum — Easy
// https://leetcode.com/problems/two-sum/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0001

import practice.*

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        TODO("Implement twoSum")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(4, 8, 1), 9" to {
            expectUnordered(intArrayOf(1, 2), Solution().twoSum(intArrayOf(4, 8, 1), 9))
        },
        "case 2: intArrayOf(5, 5), 10" to {
            expectUnordered(intArrayOf(0, 1), Solution().twoSum(intArrayOf(5, 5), 10))
        },
        "case 3: intArrayOf(-4, 7, 2), -2" to {
            expectUnordered(intArrayOf(0, 2), Solution().twoSum(intArrayOf(-4, 7, 2), -2))
        },
    )
}
