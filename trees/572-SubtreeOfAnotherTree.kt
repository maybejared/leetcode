// 572. Subtree of Another Tree — Easy
// https://leetcode.com/problems/subtree-of-another-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0572

import practice.*

class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        TODO("Implement isSubtree")
    }
}

fun main() {
    runTests(
        "case 1: tree(4, 2, 7, 1, 3), tree(2, 1, 3)" to {
            expect(true, Solution().isSubtree(tree(4, 2, 7, 1, 3), tree(2, 1, 3)))
        },
        "case 2: tree(4, 2, 7, 1, 3), tree(2, 1)" to {
            expect(false, Solution().isSubtree(tree(4, 2, 7, 1, 3), tree(2, 1)))
        },
        "case 3: tree(1), tree(1)" to {
            expect(true, Solution().isSubtree(tree(1), tree(1)))
        },
    )
}
