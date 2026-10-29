// 110. Balanced Binary Tree — Easy
// https://leetcode.com/problems/balanced-binary-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0110

import practice.*

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        TODO("Implement isBalanced")
    }
}

fun main() {
    runTests(
        "case 1: tree(1, 2, 3, 4)" to {
            expect(true, Solution().isBalanced(tree(1, 2, 3, 4)))
        },
        "case 2: tree(1, 2, null, 3)" to {
            expect(false, Solution().isBalanced(tree(1, 2, null, 3)))
        },
        "case 3: null" to {
            expect(true, Solution().isBalanced(null))
        },
    )
}
