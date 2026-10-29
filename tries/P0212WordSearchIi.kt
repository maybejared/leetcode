// 212. Word Search II — Hard
// https://leetcode.com/problems/word-search-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0212

import practice.*

class Solution {
    fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
        TODO("Implement findWords")
    }
}

fun main() {
    runTests(
        "case 1: chars(\"ab\", \"cd\"), arrayOf(\"ab\", \"ac\", \"bd\", \"abcd\")" to {
            expectUnordered(listOf("ab", "ac", "bd"), Solution().findWords(chars("ab", "cd"), arrayOf("ab", "ac", "bd", "abcd")))
        },
        "case 2: chars(\"aa\", \"aa\"), arrayOf(\"aa\", \"aaa\", \"aaaa\", \"aaaaa\")" to {
            expectUnordered(listOf("aa", "aaa", "aaaa"), Solution().findWords(chars("aa", "aa"), arrayOf("aa", "aaa", "aaaa", "aaaaa")))
        },
        "case 3: chars(\"x\"), arrayOf(\"y\", \"xx\")" to {
            expectUnordered(emptyList<String>(), Solution().findWords(chars("x"), arrayOf("y", "xx")))
        },
    )
}
