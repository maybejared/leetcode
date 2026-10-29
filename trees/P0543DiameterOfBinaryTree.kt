// 543. Diameter of Binary Tree — Easy
// https://leetcode.com/problems/diameter-of-binary-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0543

import practice.*

class Solution {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        TODO("Implement diameterOfBinaryTree")
    }
}

fun main() {
    runTests(
        "case 1: tree(1, 2, 3, 4, 5)" to {
            expect(3, Solution().diameterOfBinaryTree(tree(1, 2, 3, 4, 5)))
        },
        "case 2: tree(1)" to {
            expect(0, Solution().diameterOfBinaryTree(tree(1)))
        },
        "case 3: tree(1, 2, null, 3, null, 4)" to {
            expect(3, Solution().diameterOfBinaryTree(tree(1, 2, null, 3, null, 4)))
        },
    )
}
