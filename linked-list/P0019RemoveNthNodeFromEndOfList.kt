// 19. Remove Nth Node From End of List — Medium
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0019

import practice.*

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        TODO("Implement removeNthFromEnd")
    }
}

fun main() {
    runTests(
        "case 1: linked(2, 4, 6, 8), 2" to {
            expectList(listOf(2, 4, 8), Solution().removeNthFromEnd(linked(2, 4, 6, 8), 2))
        },
        "case 2: linked(1, 2), 2" to {
            expectList(listOf(2), Solution().removeNthFromEnd(linked(1, 2), 2))
        },
        "case 3: linked(1), 1" to {
            expectList(emptyList<Int>(), Solution().removeNthFromEnd(linked(1), 1))
        },
    )
}
