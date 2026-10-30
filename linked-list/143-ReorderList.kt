// 143. Reorder List — Medium
// https://leetcode.com/problems/reorder-list/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0143

import practice.*

class Solution {
    fun reorderList(head: ListNode?): Unit {
        TODO("Implement reorderList")
    }
}

fun main() {
    runTests(
        "even length" to {
            val head = linked(1, 2, 3, 4); Solution().reorderList(head); expectList(listOf(1, 4, 2, 3), head)
        },
        "odd length" to {
            val head = linked(1, 2, 3, 4, 5); Solution().reorderList(head); expectList(listOf(1, 5, 2, 4, 3), head)
        },
        "singleton" to {
            val head = linked(8); Solution().reorderList(head); expectList(listOf(8), head)
        },
    )
}
