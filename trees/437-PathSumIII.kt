// 437. Path Sum III — Medium
// https://leetcode.com/problems/path-sum-iii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0437

import practice.*

class Solution {
    fun pathSum(root: TreeNode?, targetSum: Int): Int {
        TODO("Implement pathSum")
    }
}

fun main() {
    runTests(
        "paths can start below root" to {
            expect(3, Solution().pathSum(tree(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1), 8))
        },
        "overlapping zero paths" to {
            expect(5, Solution().pathSum(tree(0, 0, 0), 0))
        },
        "empty" to {
            expect(0, Solution().pathSum(null, 0))
        },
        "prefix sums exceed int range" to {
            expect(0, Solution().pathSum(tree(1000000000, 1000000000, null, 294967296, null, 1000000000, null, 1000000000, null, 1000000000), 0))
        },
    )
}
