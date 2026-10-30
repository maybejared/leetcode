// 1268. Search Suggestions System — Medium
// https://leetcode.com/problems/search-suggestions-system/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1268

import practice.*

class Solution {
    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
        TODO("Implement suggestedProducts")
    }
}

fun main() {
    runTests(
        "lexicographic top three" to {
            expect(listOf(listOf("mobile", "moneypot", "monitor"), listOf("mobile", "moneypot", "monitor"), listOf("mouse", "mousepad"), listOf("mouse", "mousepad"), listOf("mouse", "mousepad")), Solution().suggestedProducts(arrayOf("mobile", "mouse", "moneypot", "monitor", "mousepad"), "mouse"))
        },
        "no matching prefix" to {
            expect(listOf(emptyList<String>(), emptyList<String>()), Solution().suggestedProducts(arrayOf("havana"), "ab"))
        },
        "single product" to {
            expect(listOf(listOf("cat"), listOf("cat"), listOf("cat")), Solution().suggestedProducts(arrayOf("cat"), "cat"))
        },
    )
}
