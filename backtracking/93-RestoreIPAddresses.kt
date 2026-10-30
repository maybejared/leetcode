// 93. Restore IP Addresses — Medium
// https://leetcode.com/problems/restore-ip-addresses/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0093

import practice.*

class Solution {
    fun restoreIpAddresses(s: String): List<String> {
        TODO("Implement restoreIpAddresses")
    }
}

fun main() {
    runTests(
        "two valid addresses" to {
            expectUnordered(listOf("255.255.11.135", "255.255.111.35"), Solution().restoreIpAddresses("25525511135"))
        },
        "zeros" to {
            expectUnordered(listOf("0.0.0.0"), Solution().restoreIpAddresses("0000"))
        },
        "leading zero handling" to {
            expectUnordered(listOf("0.10.0.10", "0.100.1.0"), Solution().restoreIpAddresses("010010"))
        },
        "too short" to {
            expectUnordered(emptyList<String>(), Solution().restoreIpAddresses("123"))
        },
    )
}
