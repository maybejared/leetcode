// 235. Lowest Common Ancestor of a Binary Search Tree — Medium
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0235

import practice.*

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        TODO("Implement lowestCommonAncestor")
    }
}

fun main() {
    runTests(
        "split at root" to {
            val r = tree(5, 2, 8, 1, 3, 7, 9)!!; check(Solution().lowestCommonAncestor(r, r.left, r.right) === r)
        },
        "same branch" to {
            val r = tree(5, 2, 8, 1, 3)!!; check(Solution().lowestCommonAncestor(r, r.left!!.left, r.left!!.right) === r.left)
        },
        "ancestor is target" to {
            val r = tree(5, 2, 8, 1, 3)!!; check(Solution().lowestCommonAncestor(r, r.left, r.left!!.right) === r.left)
        },
    )
}
