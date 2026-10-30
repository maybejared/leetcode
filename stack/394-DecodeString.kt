// 394. Decode String — Medium
// https://leetcode.com/problems/decode-string/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0394

import practice.*

class Solution {
    fun decodeString(s: String): String {
        TODO("Implement decodeString")
    }
}

fun main() {
    runTests(
        "adjacent groups" to {
            expect("aaabcbc", Solution().decodeString("3[a]2[bc]"))
        },
        "nested groups" to {
            expect("accaccacc", Solution().decodeString("3[a2[c]]"))
        },
        "literal suffix" to {
            expect("abcabccdcdcdef", Solution().decodeString("2[abc]3[cd]ef"))
        },
        "multi digit count" to {
            expect("aaaaaaaaaa", Solution().decodeString("10[a]"))
        },
    )
}
