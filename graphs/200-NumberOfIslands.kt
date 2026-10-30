// 200. Number of Islands — Medium
// https://leetcode.com/problems/number-of-islands/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0200

import practice.*

class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        TODO("Implement numIslands")
    }
}

fun main() {
    runTests(
        "case 1: chars(\"110\", \"010\", \"001\")" to {
            expect(2, Solution().numIslands(chars("110", "010", "001")))
        },
        "case 2: chars(\"000\", \"000\")" to {
            expect(0, Solution().numIslands(chars("000", "000")))
        },
        "case 3: chars(\"1\")" to {
            expect(1, Solution().numIslands(chars("1")))
        },
    )
}
