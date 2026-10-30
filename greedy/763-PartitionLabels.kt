// 763. Partition Labels — Medium
// https://leetcode.com/problems/partition-labels/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0763

import practice.*

class Solution {
    fun partitionLabels(s: String): List<Int> {
        TODO("Implement partitionLabels")
    }
}

fun main() {
    runTests(
        "case 1: \"abacddc\"," to {
            expect(listOf(3, 4), Solution().partitionLabels("abacddc",))
        },
        "case 2: \"aaaa\"," to {
            expect(listOf(4), Solution().partitionLabels("aaaa",))
        },
        "case 3: \"abcd\"," to {
            expect(listOf(1, 1, 1, 1), Solution().partitionLabels("abcd",))
        },
    )
}
