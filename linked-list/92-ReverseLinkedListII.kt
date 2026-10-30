// 92. Reverse Linked List II — Medium
// https://leetcode.com/problems/reverse-linked-list-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0092

import practice.*

class Solution {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        TODO("Implement reverseBetween")
    }
}

fun main() {
    runTests(
        "middle segment" to {
            expectList(listOf(1, 4, 3, 2, 5), Solution().reverseBetween(linked(1, 2, 3, 4, 5), 2, 4))
        },
        "whole list" to {
            expectList(listOf(3, 2, 1), Solution().reverseBetween(linked(1, 2, 3), 1, 3))
        },
        "singleton" to {
            expectList(listOf(5), Solution().reverseBetween(linked(5), 1, 1))
        },
    )
}
