// 238. Product of Array Except Self — Medium
// https://leetcode.com/problems/product-of-array-except-self/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0238

import practice.*

class Solution {
    class Solution {
        fun productExceptSelf(nums: IntArray): IntArray {
            val left = IntArray(nums.size) { 1 }
            val right = IntArray(nums.size) { 1 }
            nums.forEachIndexed { index, _ ->
                if (index == 0) return@forEachIndexed
                left[index] = left[index - 1] * nums[index - 1]
            }

            for (i in (nums.size - 1) downTo 0) {
                if (i == nums.size - 1) continue
                right[i] = right[i + 1] * nums[i + 1]
            }

            return left.mapIndexed { index, num ->
                num * right[index]
            }.toIntArray()
        }
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(2, 3, 4)" to {
            expect(intArrayOf(12, 8, 6), Solution().productExceptSelf(intArrayOf(2, 3, 4)))
        },
        "case 2: intArrayOf(0, 5, 2)" to {
            expect(intArrayOf(10, 0, 0), Solution().productExceptSelf(intArrayOf(0, 5, 2)))
        },
        "case 3: intArrayOf(0, 0, 7)" to {
            expect(intArrayOf(0, 0, 0), Solution().productExceptSelf(intArrayOf(0, 0, 7)))
        },
        "case 4: intArrayOf(-1, 2, -3)" to {
            expect(intArrayOf(-6, 3, -2), Solution().productExceptSelf(intArrayOf(-1, 2, -3)))
        },
    )
}
