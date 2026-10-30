// 231. Power of Two — Easy
// https://leetcode.com/problems/power-of-two/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0231

import practice.*

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        TODO("Implement isPowerOfTwo")
    }
}

fun main() {
    runTests(
        "powers" to {
            expect(true, Solution().isPowerOfTwo(1)); expect(true, Solution().isPowerOfTwo(16))
        },
        "non power" to {
            expect(false, Solution().isPowerOfTwo(3))
        },
        "zero and negatives" to {
            expect(false, Solution().isPowerOfTwo(0)); expect(false, Solution().isPowerOfTwo(Int.MIN_VALUE))
        },
    )
}
