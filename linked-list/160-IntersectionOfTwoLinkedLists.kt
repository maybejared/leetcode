// 160. Intersection of Two Linked Lists — Easy
// https://leetcode.com/problems/intersection-of-two-linked-lists/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0160

import practice.*

class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        TODO("Implement getIntersectionNode")
    }
}

fun main() {
    runTests(
        "shared tail" to {
            val common = linked(8, 4, 5)!!; val a = ListNode(1).also { it.next = common }; val b = linked(2, 3)!!; b.next!!.next = common; check(Solution().getIntersectionNode(a, b) === common)
        },
        "equal values without shared nodes" to {
            expect(null, Solution().getIntersectionNode(linked(1, 2), linked(1, 2)))
        },
        "empty list" to {
            expect(null, Solution().getIntersectionNode(null, linked(1)))
        },
    )
}
