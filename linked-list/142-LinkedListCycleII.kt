// 142. Linked List Cycle II — Medium
// https://leetcode.com/problems/linked-list-cycle-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0142

import practice.*

class Solution {
    fun detectCycle(head: ListNode?): ListNode? {
        TODO("Implement detectCycle")
    }
}

fun main() {
    runTests(
        "cycle to middle" to {
            val head = linked(3, 2, 0, -4)!!; val entry = head.next!!; entry.next!!.next!!.next = entry; check(Solution().detectCycle(head) === entry)
        },
        "self cycle" to {
            val head = ListNode(1); head.next = head; check(Solution().detectCycle(head) === head)
        },
        "no cycle" to {
            expect(null, Solution().detectCycle(linked(1, 2)))
        },
        "empty" to {
            expect(null, Solution().detectCycle(null))
        },
    )
}
