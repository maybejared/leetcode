// 9. Palindrome Number — Easy
// https://leetcode.com/problems/palindrome-number/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0009

import practice.*

class Solution {
    fun isPalindrome(x: Int): Boolean {
        TODO("Implement isPalindrome")
    }
}

fun main() {
    runTests(
        "palindrome" to {
            expect(true, Solution().isPalindrome(121))
        },
        "negative" to {
            expect(false, Solution().isPalindrome(-121))
        },
        "trailing zero" to {
            expect(false, Solution().isPalindrome(10))
        },
        "zero" to {
            expect(true, Solution().isPalindrome(0))
        },
        "large non palindrome" to {
            expect(false, Solution().isPalindrome(Int.MAX_VALUE))
        },
    )
}
