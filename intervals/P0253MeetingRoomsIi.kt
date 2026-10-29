// 253. Meeting Rooms II — Medium
// https://leetcode.com/problems/meeting-rooms-ii/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0253

import practice.*

class Solution {
    fun minMeetingRooms(intervals: Array<IntArray>): Int {
        TODO("Implement minMeetingRooms")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(intArrayOf(1, 5), intArrayOf(2, 6), intArrayOf(3, 7))" to {
            expect(3, Solution().minMeetingRooms(arrayOf(intArrayOf(1, 5), intArrayOf(2, 6), intArrayOf(3, 7))))
        },
        "case 2: arrayOf(intArrayOf(1, 3), intArrayOf(3, 5))" to {
            expect(1, Solution().minMeetingRooms(arrayOf(intArrayOf(1, 3), intArrayOf(3, 5))))
        },
        "case 3: emptyArray<IntArray>()" to {
            expect(0, Solution().minMeetingRooms(emptyArray<IntArray>()))
        },
    )
}
