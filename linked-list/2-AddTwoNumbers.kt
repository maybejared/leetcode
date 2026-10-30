// 2. Add Two Numbers — Medium
// https://leetcode.com/problems/add-two-numbers/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0002

import practice.*

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        TODO("Implement addTwoNumbers")
    }
}

fun main() {
    runTests(
        "case 1: linked(5, 4), linked(5, 5)" to {
            expectList(listOf(0, 0, 1), Solution().addTwoNumbers(linked(5, 4), linked(5, 5)))
        },
        "case 2: linked(0), linked(0)" to {
            expectList(listOf(0), Solution().addTwoNumbers(linked(0), linked(0)))
        },
        "case 3: linked(9, 9), linked(1)" to {
            expectList(listOf(0, 0, 1), Solution().addTwoNumbers(linked(9, 9), linked(1)))
        },
    )
}
