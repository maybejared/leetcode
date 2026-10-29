// 125. Valid Palindrome — Easy
// https://leetcode.com/problems/valid-palindrome/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0125

import practice.*

class Solution {
    fun isPalindrome(s: String): Boolean {
        TODO("Implement isPalindrome")
    }
}

fun main() {
    runTests(
        "case 1: \"Was it a car or a cat I saw?\"" to {
            expect(true, Solution().isPalindrome("Was it a car or a cat I saw?"))
        },
        "case 2: \"0P\"" to {
            expect(false, Solution().isPalindrome("0P"))
        },
        "case 3: \"...\"" to {
            expect(true, Solution().isPalindrome("..."))
        },
    )
}
