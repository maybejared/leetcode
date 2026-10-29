// 208. Implement Trie Prefix Tree — Medium
// https://leetcode.com/problems/implement-trie-prefix-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0208

import practice.*

class Trie {
    fun insert(word: String): Unit {
        TODO("Implement insert")
    }

    fun search(word: String): Boolean {
        TODO("Implement search")
    }

    fun startsWith(prefix: String): Boolean {
        TODO("Implement startsWith")
    }
}

fun main() {
    runTests(
        "word versus prefix" to {
            val t = Trie(); t.insert("train"); expect(true, t.search("train")); expect(false, t.search("tra")); expect(true, t.startsWith("tra")); t.insert("tra"); expect(true, t.search("tra"))
        },
        "missing words" to {
            val t = Trie(); expect(false, t.search("x")); t.insert("cat"); expect(false, t.startsWith("cae"))
        },
        "duplicate insertion" to {
            val t = Trie(); t.insert("a"); t.insert("a"); expect(true, t.search("a")); expect(false, t.search("aa"))
        },
    )
}
