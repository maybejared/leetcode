// 1448. Count Good Nodes In Binary Tree — Medium
// https://leetcode.com/problems/count-good-nodes-in-binary-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p1448

import practice.*

class Solution {
    fun goodNodes(root: TreeNode?): Int {
        TODO("Implement goodNodes")
    }
}

fun main() {
    runTests(
        "case 1: tree(4, 2, 6, 5, 1, 3, 7)" to {
            expect(4, Solution().goodNodes(tree(4, 2, 6, 5, 1, 3, 7)))
        },
        "case 2: tree(2, 2, 2)" to {
            expect(3, Solution().goodNodes(tree(2, 2, 2)))
        },
        "case 3: tree(-3, -4, -2)" to {
            expect(2, Solution().goodNodes(tree(-3, -4, -2)))
        },
    )
}
