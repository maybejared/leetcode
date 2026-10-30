// 199. Binary Tree Right Side View — Medium
// https://leetcode.com/problems/binary-tree-right-side-view/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0199

import practice.*

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        TODO("Implement rightSideView")
    }
}

fun main() {
    runTests(
        "case 1: tree(5, 2, 8, null, 3)" to {
            expect(listOf(5, 8, 3), Solution().rightSideView(tree(5, 2, 8, null, 3)))
        },
        "case 2: tree(1, 2, null, 3)" to {
            expect(listOf(1, 2, 3), Solution().rightSideView(tree(1, 2, null, 3)))
        },
        "case 3: null" to {
            expect(emptyList<Int>(), Solution().rightSideView(null))
        },
    )
}
