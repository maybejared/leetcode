// 100. Same Tree — Easy
// https://leetcode.com/problems/same-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0100

import practice.*

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        TODO("Implement isSameTree")
    }
}

fun main() {
    runTests(
        "case 1: tree(1, 2, 3), tree(1, 2, 3)" to {
            expect(true, Solution().isSameTree(tree(1, 2, 3), tree(1, 2, 3)))
        },
        "case 2: tree(1, 2), tree(1, null, 2)" to {
            expect(false, Solution().isSameTree(tree(1, 2), tree(1, null, 2)))
        },
        "case 3: null, null" to {
            expect(true, Solution().isSameTree(null, null))
        },
    )
}
