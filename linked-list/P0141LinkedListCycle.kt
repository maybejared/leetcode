// 141. Linked List Cycle — Easy
// https://leetcode.com/problems/linked-list-cycle/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0141

import practice.*

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        TODO("Implement hasCycle")
    }
}

fun main() {
    runTests(
        "cycle to middle" to {
            val a = linked(1, 2, 3)!!; a.next!!.next!!.next = a.next; expect(true, Solution().hasCycle(a))
        },
        "self cycle" to {
            val a = ListNode(5); a.next = a; expect(true, Solution().hasCycle(a))
        },
        "acyclic and empty" to {
            expect(false, Solution().hasCycle(linked(1, 2))); expect(false, Solution().hasCycle(null))
        },
    )
}
