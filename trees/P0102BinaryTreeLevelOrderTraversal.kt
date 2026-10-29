// 102. Binary Tree Level Order Traversal — Medium
// https://leetcode.com/problems/binary-tree-level-order-traversal/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0102

import practice.*

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        TODO("Implement levelOrder")
    }
}

fun main() {
    runTests(
        "case 1: tree(5, 2, 8, null, 3)" to {
            expect(listOf(listOf(5), listOf(2, 8), listOf(3)), Solution().levelOrder(tree(5, 2, 8, null, 3)))
        },
        "case 2: tree(1)" to {
            expect(listOf(listOf(1)), Solution().levelOrder(tree(1)))
        },
        "case 3: null" to {
            expect(emptyList<List<Int>>(), Solution().levelOrder(null))
        },
    )
}
