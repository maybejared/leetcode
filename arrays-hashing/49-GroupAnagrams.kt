package arrays_hashing.P0049GroupAnagrams

import practice.*

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs.groupBy { sort(it) }.entries.map { it.value }
    }

    // alphabetical sort using countsort - O(N)
    private fun sort(str: String): String {
        val counts = IntArray(26)
        for (c in str) {
            // Increment occurence of character
            counts[c - 'a']++
        }

        return buildString {
            for (i in 0 until 26) {
                repeat(counts[i]) {
                    append('a' + i)
                }
            }
        }
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(\"ab\", \"ba\", \"cat\", \"act\", \"x\")" to {
            expectGroups(
                listOf(listOf("ab", "ba"), listOf("cat", "act"), listOf("x")),
                Solution().groupAnagrams(arrayOf("ab", "ba", "cat", "act", "x"))
            )
        },
        "case 2: arrayOf(\"\")" to {
            expectGroups(listOf(listOf("")), Solution().groupAnagrams(arrayOf("")))
        },
        "case 3: arrayOf(\"a\", \"a\", \"b\")" to {
            expectGroups(listOf(listOf("a", "a"), listOf("b")), Solution().groupAnagrams(arrayOf("a", "a", "b")))
        },
    )
}
