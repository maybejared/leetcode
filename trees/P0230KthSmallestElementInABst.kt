// 230. Kth Smallest Element In a Bst — Medium
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0230

import practice.*

class Solution {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        TODO("Implement kthSmallest")
    }
}

fun main() {
    runTests(
        "case 1: tree(5, 2, 8, 1, 3), 3" to {
            expect(3, Solution().kthSmallest(tree(5, 2, 8, 1, 3), 3))
        },
        "case 2: tree(5, 2, 8, 1, 3), 1" to {
            expect(1, Solution().kthSmallest(tree(5, 2, 8, 1, 3), 1))
        },
        "case 3: tree(7), 1" to {
            expect(7, Solution().kthSmallest(tree(7), 1))
        },
    )
}
