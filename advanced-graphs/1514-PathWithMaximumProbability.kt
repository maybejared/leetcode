// 1514. Path with Maximum Probability — Medium
// https://leetcode.com/problems/path-with-maximum-probability/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1514

import practice.*

class Solution {
    fun maxProbability(n: Int, edges: Array<IntArray>, succProb: DoubleArray, start_node: Int, end_node: Int): Double {
        TODO("Implement maxProbability")
    }
}

fun main() {
    runTests(
        "indirect path wins" to {
            expectNear(0.25, Solution().maxProbability(3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2)), doubleArrayOf(0.5, 0.5, 0.2), 0, 2))
        },
        "direct path wins" to {
            expectNear(0.3, Solution().maxProbability(3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2)), doubleArrayOf(0.5, 0.5, 0.3), 0, 2))
        },
        "unreachable" to {
            expectNear(0.0, Solution().maxProbability(3, arrayOf(intArrayOf(0, 1)), doubleArrayOf(0.5), 0, 2))
        },
    )
}
