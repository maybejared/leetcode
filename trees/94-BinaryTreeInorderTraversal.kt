// 94. Binary Tree Inorder Traversal — Easy
// https://leetcode.com/problems/binary-tree-inorder-traversal/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0094

import practice.*

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        TODO("Implement inorderTraversal")
    }
}

fun main() {
    runTests(
        "right subtree" to {
            expect(listOf(1, 3, 2), Solution().inorderTraversal(tree(1, null, 2, 3)))
        },
        "both subtrees" to {
            expect(listOf(1, 2, 3), Solution().inorderTraversal(tree(2, 1, 3)))
        },
        "empty" to {
            expect(emptyList<Int>(), Solution().inorderTraversal(null))
        },
    )
}
