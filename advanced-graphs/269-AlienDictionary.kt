// 269. Alien Dictionary — Hard
// https://leetcode.com/problems/alien-dictionary/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0269

import practice.*

class Solution {
    fun alienOrder(words: Array<String>): String {
        TODO("Implement alienOrder")
    }
}

fun main() {
    runTests(
        "multiple valid orders" to {
            val words = arrayOf("za", "zb", "ca", "cb"); expectAlienOrder(words, Solution().alienOrder(words))
        },
        "cycle" to {
            expect("", Solution().alienOrder(arrayOf("a", "b", "a")))
        },
        "invalid prefix" to {
            expect("", Solution().alienOrder(arrayOf("abc", "ab")))
        },
        "all characters retained" to {
            val words = arrayOf("abc"); expectAlienOrder(words, Solution().alienOrder(words))
        },
    )
}
