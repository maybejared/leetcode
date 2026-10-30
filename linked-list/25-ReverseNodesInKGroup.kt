// 25. Reverse Nodes In K Group — Hard
// https://leetcode.com/problems/reverse-nodes-in-k-group/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0025

import practice.*

class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        TODO("Implement reverseKGroup")
    }
}

fun main() {
    runTests(
        "case 1: linked(1, 2, 3, 4, 5), 2" to {
            expectList(listOf(2, 1, 4, 3, 5), Solution().reverseKGroup(linked(1, 2, 3, 4, 5), 2))
        },
        "case 2: linked(1, 2, 3, 4, 5), 3" to {
            expectList(listOf(3, 2, 1, 4, 5), Solution().reverseKGroup(linked(1, 2, 3, 4, 5), 3))
        },
        "case 3: linked(7), 1" to {
            expectList(listOf(7), Solution().reverseKGroup(linked(7), 1))
        },
    )
}
