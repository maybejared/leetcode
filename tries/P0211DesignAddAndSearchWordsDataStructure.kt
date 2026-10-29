// 211. Design Add And Search Words Data Structure — Medium
// https://leetcode.com/problems/design-add-and-search-words-data-structure/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0211

import practice.*

class WordDictionary {
    fun addWord(word: String): Unit {
        TODO("Implement addWord")
    }

    fun search(word: String): Boolean {
        TODO("Implement search")
    }
}

fun main() {
    runTests(
        "wildcards" to {
            val d = WordDictionary(); d.addWord("cat"); d.addWord("car"); expect(true, d.search("ca.")); expect(true, d.search(".at")); expect(false, d.search("..")); expect(false, d.search("dog"))
        },
        "all wildcards" to {
            val d = WordDictionary(); d.addWord("xy"); expect(true, d.search("..")); expect(false, d.search("..."))
        },
        "prefix is not word" to {
            val d = WordDictionary(); d.addWord("apple"); expect(false, d.search("app")); d.addWord("app"); expect(true, d.search("app"))
        },
    )
}
