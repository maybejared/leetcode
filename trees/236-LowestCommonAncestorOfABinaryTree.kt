// 236. Lowest Common Ancestor of a Binary Tree — Medium
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0236

import practice.*

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        TODO("Implement lowestCommonAncestor")
    }
}

fun main() {
    runTests(
        "different branches" to {
            val root = tree(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)!!; check(Solution().lowestCommonAncestor(root, root.left, root.right) === root)
        },
        "one node is ancestor" to {
            val root = tree(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)!!; check(Solution().lowestCommonAncestor(root, root.left, root.left!!.right!!.right) === root.left)
        },
    )
}
