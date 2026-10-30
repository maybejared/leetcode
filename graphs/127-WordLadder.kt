// 127. Word Ladder — Hard
// https://leetcode.com/problems/word-ladder/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0127

import practice.*

class Solution {
    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        TODO("Implement ladderLength")
    }
}

fun main() {
    runTests(
        "case 1: \"cat\", \"dog\", listOf(\"cot\", \"cog\", \"dog\")" to {
            expect(4, Solution().ladderLength("cat", "dog", listOf("cot", "cog", "dog")))
        },
        "case 2: \"cat\", \"dog\", listOf(\"cot\", \"cog\")" to {
            expect(0, Solution().ladderLength("cat", "dog", listOf("cot", "cog")))
        },
        "case 3: \"a\", \"c\", listOf(\"a\", \"b\", \"c\")" to {
            expect(2, Solution().ladderLength("a", "c", listOf("a", "b", "c")))
        },
    )
}
