// 621. Task Scheduler — Medium
// https://leetcode.com/problems/task-scheduler/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0621

import practice.*

class Solution {
    fun leastInterval(tasks: CharArray, n: Int): Int {
        TODO("Implement leastInterval")
    }
}

fun main() {
    runTests(
        "case 1: charArrayOf('A', 'A', 'A', 'B', 'B'), 2" to {
            expect(7, Solution().leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B'), 2))
        },
        "case 2: charArrayOf('A', 'A', 'B'), 0" to {
            expect(3, Solution().leastInterval(charArrayOf('A', 'A', 'B'), 0))
        },
        "case 3: charArrayOf('A', 'B', 'C'), 4" to {
            expect(3, Solution().leastInterval(charArrayOf('A', 'B', 'C'), 4))
        },
    )
}
