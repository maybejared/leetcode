// 76. Minimum Window Substring — Hard
// https://leetcode.com/problems/minimum-window-substring/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0076

import practice.*

class Solution {
    fun minWindow(s: String, t: String): String {
        TODO("Implement minWindow")
    }
}

fun main() {
    runTests(
        "case 1: \"cabefgecdaecf\", \"cae\"" to {
            expect("aec", Solution().minWindow("cabefgecdaecf", "cae"))
        },
        "case 2: \"a\", \"aa\"" to {
            expect("", Solution().minWindow("a", "aa"))
        },
        "case 3: \"aaab\", \"aab\"" to {
            expect("aab", Solution().minWindow("aaab", "aab"))
        },
    )
}
