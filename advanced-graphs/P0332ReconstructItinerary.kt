// 332. Reconstruct Itinerary — Hard
// https://leetcode.com/problems/reconstruct-itinerary/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0332

import practice.*

class Solution {
    fun findItinerary(tickets: List<List<String>>): List<String> {
        TODO("Implement findItinerary")
    }
}

fun main() {
    runTests(
        "case 1: listOf(listOf(\"JFK\", \"BBB\"), listOf(\"JFK\", \"AAA\"), listOf(\"AAA\", \"JFK\"))" to {
            expect(listOf("JFK", "AAA", "JFK", "BBB"), Solution().findItinerary(listOf(listOf("JFK", "BBB"), listOf("JFK", "AAA"), listOf("AAA", "JFK"))))
        },
        "case 2: listOf(listOf(\"JFK\", \"AAA\"), listOf(\"AAA\", \"JFK\"), listOf(\"JFK\", \"AAA\"))" to {
            expect(listOf("JFK", "AAA", "JFK", "AAA"), Solution().findItinerary(listOf(listOf("JFK", "AAA"), listOf("AAA", "JFK"), listOf("JFK", "AAA"))))
        },
        "case 3: listOf(listOf(\"JFK\", \"LAX\"))" to {
            expect(listOf("JFK", "LAX"), Solution().findItinerary(listOf(listOf("JFK", "LAX"))))
        },
    )
}
