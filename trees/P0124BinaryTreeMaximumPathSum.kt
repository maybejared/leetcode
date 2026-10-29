// 124. Binary Tree Maximum Path Sum — Hard
// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0124

import practice.*

class Solution {
    fun maxPathSum(root: TreeNode?): Int {
        TODO("Implement maxPathSum")
    }
}

fun main() {
    runTests(
        "case 1: tree(-5, 4, 8, null, null, 6, 7)" to {
            expect(21, Solution().maxPathSum(tree(-5, 4, 8, null, null, 6, 7)))
        },
        "case 2: tree(-3, -4, -1)" to {
            expect(-1, Solution().maxPathSum(tree(-3, -4, -1)))
        },
        "case 3: tree(5)" to {
            expect(5, Solution().maxPathSum(tree(5)))
        },
    )
}
