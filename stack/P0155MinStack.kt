// 155. Min Stack — Medium
// https://leetcode.com/problems/min-stack/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0155

import practice.*

class MinStack {
    fun push(`val`: Int): Unit {
        TODO("Implement push")
    }

    fun pop(): Unit {
        TODO("Implement pop")
    }

    fun top(): Int {
        TODO("Implement top")
    }

    fun getMin(): Int {
        TODO("Implement getMin")
    }
}

fun main() {
    runTests(
        "minimum changes" to {
            val s = MinStack(); s.push(4); s.push(-1); s.push(2); expect(-1, s.getMin()); expect(2, s.top()); s.pop(); s.pop(); expect(4, s.getMin())
        },
        "duplicate minima" to {
            val s = MinStack(); s.push(-3); s.push(-3); s.pop(); expect(-3, s.getMin()); expect(-3, s.top())
        },
        "reuse empty stack" to {
            val s = MinStack(); s.push(1); s.pop(); s.push(8); expect(8, s.top()); expect(8, s.getMin())
        },
    )
}
