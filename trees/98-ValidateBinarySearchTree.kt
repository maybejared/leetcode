// 98. Validate Binary Search Tree — Medium
// https://leetcode.com/problems/validate-binary-search-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0098

import practice.*

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        TODO("Implement isValidBST")
    }
}

fun main() {
    runTests(
        "case 1: tree(5, 2, 8, 1, 3, 7, 9)" to {
            expect(true, Solution().isValidBST(tree(5, 2, 8, 1, 3, 7, 9)))
        },
        "case 2: tree(5, 2, 8, null, null, 4, 9)" to {
            expect(false, Solution().isValidBST(tree(5, 2, 8, null, null, 4, 9)))
        },
        "case 3: tree(2, 2, 3)" to {
            expect(false, Solution().isValidBST(tree(2, 2, 3)))
        },
        "case 4: tree(Int.MIN_VALUE, null, Int.MAX_VALUE)" to {
            expect(true, Solution().isValidBST(tree(Int.MIN_VALUE, null, Int.MAX_VALUE)))
        },
    )
}
