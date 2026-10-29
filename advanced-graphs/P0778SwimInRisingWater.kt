// 778. Swim In Rising Water — Hard
// https://leetcode.com/problems/swim-in-rising-water/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0778

import practice.*

class Solution {
    fun swimInWater(grid: Array<IntArray>): Int {
        TODO("Implement swimInWater")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(0, 2), intArrayOf(1, 3))" to {
            expect(3, Solution().swimInWater(arrayOf(intArrayOf(0, 2), intArrayOf(1, 3))))
        },
        "case 2: arrayOf(intArrayOf(0))" to {
            expect(0, Solution().swimInWater(arrayOf(intArrayOf(0))))
        },
        "case 3: arrayOf(intArrayOf(3, 2), intArrayOf(0, 1))" to {
            expect(3, Solution().swimInWater(arrayOf(intArrayOf(3, 2), intArrayOf(0, 1))))
        },
    )
}
