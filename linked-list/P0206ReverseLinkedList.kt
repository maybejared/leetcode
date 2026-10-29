// 206. Reverse Linked List — Easy
// https://leetcode.com/problems/reverse-linked-list/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0206

import practice.*

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        TODO("Implement reverseList")
    }
}

fun main() {
    runTests(
        "case 1: linked(4, 2, 9)" to {
            expectList(listOf(9, 2, 4), Solution().reverseList(linked(4, 2, 9)))
        },
        "case 2: linked(7)" to {
            expectList(listOf(7), Solution().reverseList(linked(7)))
        },
        "case 3: null" to {
            expectList(emptyList<Int>(), Solution().reverseList(null))
        },
    )
}
