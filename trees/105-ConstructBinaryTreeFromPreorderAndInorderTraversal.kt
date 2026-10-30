// 105. Construct Binary Tree From Preorder And Inorder Traversal — Medium
// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0105

import practice.*

class Solution {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        TODO("Implement buildTree")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(5, 2, 1, 8), intArrayOf(1, 2, 5, 8)" to {
            expectTree(listOf(5, 2, 8, 1), Solution().buildTree(intArrayOf(5, 2, 1, 8), intArrayOf(1, 2, 5, 8)))
        },
        "case 2: intArrayOf(7), intArrayOf(7)" to {
            expectTree(listOf(7), Solution().buildTree(intArrayOf(7), intArrayOf(7)))
        },
        "case 3: intArrayOf(1, 2, 3), intArrayOf(1, 2, 3)" to {
            expectTree(listOf(1, null, 2, null, 3), Solution().buildTree(intArrayOf(1, 2, 3), intArrayOf(1, 2, 3)))
        },
    )
}
