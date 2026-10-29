package neetcode.p0217

import practice.*

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.groupBy { it }.any { it.value.size > 1 }
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(4, 9, 4)" to {
            expect(true, Solution().containsDuplicate(intArrayOf(4, 9, 4)))
        },
        "case 2: intArrayOf(3, 1, 7)" to {
            expect(false, Solution().containsDuplicate(intArrayOf(3, 1, 7)))
        },
        "case 3: intArrayOf(0)" to {
            expect(false, Solution().containsDuplicate(intArrayOf(0)))
        },
        "case 4: intArrayOf(-2, -2)" to {
            expect(true, Solution().containsDuplicate(intArrayOf(-2, -2)))
        },
    )
}
