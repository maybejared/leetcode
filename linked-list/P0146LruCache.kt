// 146. LRU Cache — Medium
// https://leetcode.com/problems/lru-cache/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0146

import practice.*

class LRUCache(capacity: Int) {
    fun get(key: Int): Int {
        TODO("Implement get")
    }

    fun put(key: Int, value: Int): Unit {
        TODO("Implement put")
    }
}

fun main() {
    runTests(
        "get updates recency" to {
            val c = LRUCache(2); c.put(1, 10); c.put(2, 20); expect(10, c.get(1)); c.put(3, 30); expect(-1, c.get(2)); expect(30, c.get(3))
        },
        "overwrite updates recency" to {
            val c = LRUCache(2); c.put(1, 10); c.put(2, 20); c.put(1, 11); c.put(3, 30); expect(11, c.get(1)); expect(-1, c.get(2))
        },
        "capacity one" to {
            val c = LRUCache(1); expect(-1, c.get(7)); c.put(7, 70); c.put(8, 80); expect(-1, c.get(7)); expect(80, c.get(8))
        },
    )
}
