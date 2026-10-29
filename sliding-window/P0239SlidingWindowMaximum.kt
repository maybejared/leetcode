// 239. Sliding Window Maximum — Hard
// https://leetcode.com/problems/sliding-window-maximum/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0239

import practice.*

class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        TODO("Implement maxSlidingWindow")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(4, 1, 3, 5, 2), 3" to {
            expect(intArrayOf(4, 5, 5), Solution().maxSlidingWindow(intArrayOf(4, 1, 3, 5, 2), 3))
        },
        "case 2: intArrayOf(-2, -1), 1" to {
            expect(intArrayOf(-2, -1), Solution().maxSlidingWindow(intArrayOf(-2, -1), 1))
        },
        "case 3: intArrayOf(2, 2, 2), 3" to {
            expect(intArrayOf(2), Solution().maxSlidingWindow(intArrayOf(2, 2, 2), 3))
        },
    )
}
