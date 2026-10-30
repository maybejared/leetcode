// 904. Fruit Into Baskets — Medium
// https://leetcode.com/problems/fruit-into-baskets/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0904

import practice.*

class Solution {
    fun totalFruit(fruits: IntArray): Int {
        TODO("Implement totalFruit")
    }
}

fun main() {
    runTests(
        "two types" to {
            expect(3, Solution().totalFruit(intArrayOf(1, 2, 1)))
        },
        "third type" to {
            expect(3, Solution().totalFruit(intArrayOf(0, 1, 2, 2)))
        },
        "repeated shrinking" to {
            expect(4, Solution().totalFruit(intArrayOf(1, 2, 3, 2, 2)))
        },
    )
}
