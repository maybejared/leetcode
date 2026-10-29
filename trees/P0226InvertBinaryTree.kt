// 226. Invert Binary Tree — Easy
// https://leetcode.com/problems/invert-binary-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0226

import practice.*

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        TODO("Implement invertTree")
    }
}

fun main() {
    runTests(
        "case 1: tree(5, 2, 8, 1, 3)" to {
            expectTree(listOf(5, 8, 2, null, null, 3, 1), Solution().invertTree(tree(5, 2, 8, 1, 3)))
        },
        "case 2: tree(4)" to {
            expectTree(listOf(4), Solution().invertTree(tree(4)))
        },
        "case 3: null" to {
            expectTree(emptyList<Int?>(), Solution().invertTree(null))
        },
    )
}
