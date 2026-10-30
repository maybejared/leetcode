// 112. Path Sum — Easy
// https://leetcode.com/problems/path-sum/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0112

import practice.*

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        TODO("Implement hasPathSum")
    }
}

fun main() {
    runTests(
        "root to leaf" to {
            expect(true, Solution().hasPathSum(tree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 22))
        },
        "must reach leaf" to {
            expect(false, Solution().hasPathSum(tree(1, 2), 1))
        },
        "empty" to {
            expect(false, Solution().hasPathSum(null, 0))
        },
        "negative values" to {
            expect(true, Solution().hasPathSum(tree(-2, null, -3), -5))
        },
    )
}
