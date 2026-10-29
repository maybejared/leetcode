// 252. Meeting Rooms — Easy
// https://leetcode.com/problems/meeting-rooms/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0252

import practice.*

class Solution {
    fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
        TODO("Implement canAttendMeetings")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 5), intArrayOf(4, 7))" to {
            expect(false, Solution().canAttendMeetings(arrayOf(intArrayOf(1, 5), intArrayOf(4, 7))))
        },
        "case 2: arrayOf(intArrayOf(1, 3), intArrayOf(3, 5))" to {
            expect(true, Solution().canAttendMeetings(arrayOf(intArrayOf(1, 3), intArrayOf(3, 5))))
        },
        "case 3: emptyArray<IntArray>()" to {
            expect(true, Solution().canAttendMeetings(emptyArray<IntArray>()))
        },
    )
}
