// 23. Merge K Sorted Lists — Hard
// https://leetcode.com/problems/merge-k-sorted-lists/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0023

import practice.*

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        TODO("Implement mergeKLists")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(linked(1, 5), linked(2, 4), linked(3))" to {
            expectList(listOf(1, 2, 3, 4, 5), Solution().mergeKLists(arrayOf(linked(1, 5), linked(2, 4), linked(3))))
        },
        "case 2: emptyArray<ListNode?>()" to {
            expectList(emptyList<Int>(), Solution().mergeKLists(emptyArray<ListNode?>()))
        },
        "case 3: arrayOf(null, linked(2, 2), null)" to {
            expectList(listOf(2, 2), Solution().mergeKLists(arrayOf(null, linked(2, 2), null)))
        },
    )
}
