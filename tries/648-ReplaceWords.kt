// 648. Replace Words — Medium
// https://leetcode.com/problems/replace-words/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0648

import practice.*

class Solution {
    fun replaceWords(dictionary: List<String>, sentence: String): String {
        TODO("Implement replaceWords")
    }
}

fun main() {
    runTests(
        "replace roots" to {
            expect("the cat was rat by the bat", Solution().replaceWords(listOf("cat", "bat", "rat"), "the cattle was rattled by the battery"))
        },
        "shortest root wins" to {
            expect("a a b c", Solution().replaceWords(listOf("a", "aa", "b", "c"), "aadsfasf absbs bbab cadsfafs"))
        },
        "no matching root" to {
            expect("hello world", Solution().replaceWords(listOf("cat"), "hello world"))
        },
    )
}
