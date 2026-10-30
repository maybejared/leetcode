// 735. Asteroid Collision — Medium
// https://leetcode.com/problems/asteroid-collision/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0735

import practice.*

class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        TODO("Implement asteroidCollision")
    }
}

fun main() {
    runTests(
        "larger survives" to {
            expect(intArrayOf(5, 10), Solution().asteroidCollision(intArrayOf(5, 10, -5)))
        },
        "equal collision" to {
            expect(intArrayOf(), Solution().asteroidCollision(intArrayOf(8, -8)))
        },
        "chain collision" to {
            expect(intArrayOf(10), Solution().asteroidCollision(intArrayOf(10, 2, -5)))
        },
        "moving apart" to {
            expect(intArrayOf(-2, -1, 1, 2), Solution().asteroidCollision(intArrayOf(-2, -1, 1, 2)))
        },
    )
}
