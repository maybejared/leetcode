// 97. Interleaving String — Medium
// https://leetcode.com/problems/interleaving-string/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0097

import practice.*

class Solution {
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        TODO("Implement isInterleave")
    }
}

fun main() {
    runTests(
        "case 1: \"ab\", \"cd\", \"acbd\"" to {
            expect(true, Solution().isInterleave("ab", "cd", "acbd"))
        },
        "case 2: \"ab\", \"cd\", \"adbc\"" to {
            expect(false, Solution().isInterleave("ab", "cd", "adbc"))
        },
        "case 3: \"\", \"\", \"\"" to {
            expect(true, Solution().isInterleave("", "", ""))
        },
        "case 4: \"a\", \"b\", \"a\"" to {
            expect(false, Solution().isInterleave("a", "b", "a"))
        },
    )
}
