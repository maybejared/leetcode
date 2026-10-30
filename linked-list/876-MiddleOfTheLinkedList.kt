// 876. Middle of the Linked List — Easy
// https://leetcode.com/problems/middle-of-the-linked-list/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0876

import practice.*

class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        TODO("Implement middleNode")
    }
}

fun main() {
    runTests(
        "odd length identity" to {
            val head = linked(1, 2, 3, 4, 5)!!; check(Solution().middleNode(head) === head.next!!.next)
        },
        "even length second middle" to {
            val head = linked(1, 2, 3, 4)!!; check(Solution().middleNode(head) === head.next!!.next)
        },
        "singleton identity" to {
            val head = ListNode(9); check(Solution().middleNode(head) === head)
        },
    )
}
