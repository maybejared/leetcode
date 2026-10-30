// 104. Maximum Depth of Binary Tree — Easy
// https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0104

import practice.*

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        TODO("Implement maxDepth")
    }
}

fun main() {
    runTests(
        "case 1: tree(1, 2, 3, null, 4)" to {
            expect(3, Solution().maxDepth(tree(1, 2, 3, null, 4)))
        },
        "case 2: tree(1)" to {
            expect(1, Solution().maxDepth(tree(1)))
        },
        "case 3: null" to {
            expect(0, Solution().maxDepth(null))
        },
    )
}
