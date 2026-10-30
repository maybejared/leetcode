// 973. K Closest Points to Origin — Medium
// https://leetcode.com/problems/k-closest-points-to-origin/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0973

import practice.*

class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        TODO("Implement kClosest")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 1), intArrayOf(3, 4), intArrayOf(-1, 0)), 2" to {
            expectUnordered(arrayOf(intArrayOf(1, 1), intArrayOf(-1, 0)), Solution().kClosest(arrayOf(intArrayOf(1, 1), intArrayOf(3, 4), intArrayOf(-1, 0)), 2))
        },
        "case 2: arrayOf(intArrayOf(0, 0)), 1" to {
            expectUnordered(arrayOf(intArrayOf(0, 0)), Solution().kClosest(arrayOf(intArrayOf(0, 0)), 1))
        },
        "case 3: arrayOf(intArrayOf(2, 0), intArrayOf(0, 2)), 2" to {
            expectUnordered(arrayOf(intArrayOf(2, 0), intArrayOf(0, 2)), Solution().kClosest(arrayOf(intArrayOf(2, 0), intArrayOf(0, 2)), 2))
        },
    )
}
