// 271. Encode and Decode Strings — Medium
// https://leetcode.com/problems/encode-and-decode-strings/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0271

import practice.*

class Solution {
    fun encode(strs: List<String>): String {
        TODO("Implement encode")
    }

    fun decode(s: String): List<String> {
        TODO("Implement decode")
    }
}

fun main() {
    runTests(
        "ordinary strings" to {
            val input = listOf("red", "blue"); val encoded = Solution().encode(input); expect(input, Solution().decode(encoded))
        },
        "empty list" to {
            val input = emptyList<String>(); val encoded = Solution().encode(input); expect(input, Solution().decode(encoded))
        },
        "delimiters and empty strings" to {
            val input = listOf("", "3#cat", "a:b", "", "🦊", "雪"); val encoded = Solution().encode(input); expect(input, Solution().decode(encoded))
        },
    )
}
