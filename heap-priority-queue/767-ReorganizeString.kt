// 767. Reorganize String — Medium
// https://leetcode.com/problems/reorganize-string/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0767

import practice.*

class Solution {
    fun reorganizeString(s: String): String {
        TODO("Implement reorganizeString")
    }
}

fun main() {
    runTests(
        "valid rearrangement" to {
            val input = "aab"; val result = Solution().reorganizeString(input); expect(input.toList().sorted(), result.toList().sorted()); check(result.zipWithNext().all { (a, b) -> a != b })
        },
        "impossible" to {
            expect("", Solution().reorganizeString("aaab"))
        },
        "multiple valid answers" to {
            val input = "vvvlo"; val result = Solution().reorganizeString(input); expect(input.toList().sorted(), result.toList().sorted()); check(result.zipWithNext().all { (a, b) -> a != b })
        },
        "singleton" to {
            expect("a", Solution().reorganizeString("a"))
        },
    )
}
