// 72. Edit Distance — Medium
// https://leetcode.com/problems/edit-distance/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0072

import practice.*

class Solution {
    fun minDistance(word1: String, word2: String): Int {
        TODO("Implement minDistance")
    }
}

fun main() {
    runTests(
        "case 1: \"cat\", \"cut\"" to {
            expect(1, Solution().minDistance("cat", "cut"))
        },
        "case 2: \"\", \"abc\"" to {
            expect(3, Solution().minDistance("", "abc"))
        },
        "case 3: \"same\", \"same\"" to {
            expect(0, Solution().minDistance("same", "same"))
        },
        "case 4: \"abc\", \"yabd\"" to {
            expect(2, Solution().minDistance("abc", "yabd"))
        },
    )
}
