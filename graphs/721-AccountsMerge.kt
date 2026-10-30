// 721. Accounts Merge — Medium
// https://leetcode.com/problems/accounts-merge/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0721

import practice.*

class Solution {
    fun accountsMerge(accounts: List<List<String>>): List<List<String>> {
        TODO("Implement accountsMerge")
    }
}

fun main() {
    runTests(
        "shared email merges accounts" to {
            val result = Solution().accountsMerge(listOf(listOf("John", "johnsmith@mail.com", "john_newyork@mail.com"), listOf("John", "johnsmith@mail.com", "john00@mail.com"), listOf("Mary", "mary@mail.com"), listOf("John", "johnnybravo@mail.com"))); expectUnordered(listOf(listOf("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"), listOf("Mary", "mary@mail.com"), listOf("John", "johnnybravo@mail.com")), result)
        },
        "transitive merging" to {
            expectUnordered(listOf(listOf("A", "a@x.com", "b@x.com", "c@x.com", "d@x.com")), Solution().accountsMerge(listOf(listOf("A", "a@x.com", "b@x.com"), listOf("A", "c@x.com", "d@x.com"), listOf("A", "b@x.com", "c@x.com"))))
        },
    )
}
