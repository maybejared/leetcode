// 21. Merge Two Sorted Lists — Easy
// https://leetcode.com/problems/merge-two-sorted-lists/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0021

import practice.*

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        TODO("Implement mergeTwoLists")
    }
}

fun main() {
    runTests(
        "case 1: linked(1, 4), linked(2, 3)" to {
            expectList(listOf(1, 2, 3, 4), Solution().mergeTwoLists(linked(1, 4), linked(2, 3)))
        },
        "case 2: null, linked(0)" to {
            expectList(listOf(0), Solution().mergeTwoLists(null, linked(0)))
        },
        "case 3: linked(2), linked(2)" to {
            expectList(listOf(2, 2), Solution().mergeTwoLists(linked(2), linked(2)))
        },
    )
}
