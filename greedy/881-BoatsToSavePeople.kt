// 881. Boats to Save People — Medium
// https://leetcode.com/problems/boats-to-save-people/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0881

import practice.*

class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        TODO("Implement numRescueBoats")
    }
}

fun main() {
    runTests(
        "one pair" to {
            expect(1, Solution().numRescueBoats(intArrayOf(1, 2), 3))
        },
        "mixed pairings" to {
            expect(3, Solution().numRescueBoats(intArrayOf(3, 2, 2, 1), 3))
        },
        "all alone" to {
            expect(4, Solution().numRescueBoats(intArrayOf(3, 5, 3, 4), 5))
        },
    )
}
