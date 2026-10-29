// 43. Multiply Strings — Medium
// https://leetcode.com/problems/multiply-strings/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0043

import practice.*

class Solution {
    fun multiply(num1: String, num2: String): String {
        TODO("Implement multiply")
    }
}

fun main() {
    runTests(
        "case 1: \"12\", \"13\"" to {
            expect("156", Solution().multiply("12", "13"))
        },
        "case 2: \"0\", \"999\"" to {
            expect("0", Solution().multiply("0", "999"))
        },
        "case 3: \"99\", \"99\"" to {
            expect("9801", Solution().multiply("99", "99"))
        },
    )
}
