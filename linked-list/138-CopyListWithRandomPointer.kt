// 138. Copy List With Random Pointer — Medium
// https://leetcode.com/problems/copy-list-with-random-pointer/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0138

import practice.*
import practice.RandomNode as Node

class Solution {
    fun copyRandomList(node: Node?): Node? {
        TODO("Implement copyRandomList")
    }
}

fun main() {
    runTests(
        "cross and self references" to {
            val a = Node(4); val b = Node(9); val c = Node(4); a.next = b; b.next = c; a.random = c; b.random = b; c.random = a; expectRandomClone(a, Solution().copyRandomList(a))
        },
        "null random" to {
            val a = Node(3); expectRandomClone(a, Solution().copyRandomList(a))
        },
        "empty" to {
            expect(null, Solution().copyRandomList(null))
        },
    )
}
