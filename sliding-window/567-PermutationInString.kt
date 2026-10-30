// 567. Permutation In String — Medium
// https://leetcode.com/problems/permutation-in-string/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0567

import practice.*

class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        TODO("Implement checkInclusion")
    }
}

fun main() {
    runTests(
        "case 1: \"abc\", \"zzcabx\"" to {
            expect(true, Solution().checkInclusion("abc", "zzcabx"))
        },
        "case 2: \"aab\", \"abca\"" to {
            expect(false, Solution().checkInclusion("aab", "abca"))
        },
        "case 3: \"a\", \"a\"" to {
            expect(true, Solution().checkInclusion("a", "a"))
        },
    )
}
