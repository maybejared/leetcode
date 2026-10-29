// 1899. Merge Triplets to Form Target Triplet — Medium
// https://leetcode.com/problems/merge-triplets-to-form-target-triplet/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1899

import practice.*

class Solution {
    fun mergeTriplets(triplets: Array<IntArray>, target: IntArray): Boolean {
        TODO("Implement mergeTriplets")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 3, 2), intArrayOf(2, 2, 4)), intArrayOf(2, 3, 4)" to {
            expect(true, Solution().mergeTriplets(arrayOf(intArrayOf(1, 3, 2), intArrayOf(2, 2, 4)), intArrayOf(2, 3, 4)))
        },
        "case 2: arrayOf(intArrayOf(2, 4, 4), intArrayOf(1, 3, 2)), intArrayOf(2, 3, 4)" to {
            expect(false, Solution().mergeTriplets(arrayOf(intArrayOf(2, 4, 4), intArrayOf(1, 3, 2)), intArrayOf(2, 3, 4)))
        },
        "case 3: arrayOf(intArrayOf(2, 3, 4)), intArrayOf(2, 3, 4)" to {
            expect(true, Solution().mergeTriplets(arrayOf(intArrayOf(2, 3, 4)), intArrayOf(2, 3, 4)))
        },
    )
}
