// 62. Unique Paths — Medium
// https://leetcode.com/problems/unique-paths/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0062

import practice.*

class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        TODO("Implement uniquePaths")
    }
}

fun main() {
    runTests(
        "case 1: 3, 4" to {
            expect(10, Solution().uniquePaths(3, 4))
        },
        "case 2: 1, 5" to {
            expect(1, Solution().uniquePaths(1, 5))
        },
        "case 3: 2, 2" to {
            expect(2, Solution().uniquePaths(2, 2))
        },
    )
}
