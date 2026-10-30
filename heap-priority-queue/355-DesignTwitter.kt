// 355. Design Twitter — Medium
// https://leetcode.com/problems/design-twitter/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0355

import practice.*

class Twitter {
    fun postTweet(userId: Int, tweetId: Int): Unit {
        TODO("Implement postTweet")
    }

    fun getNewsFeed(userId: Int): List<Int> {
        TODO("Implement getNewsFeed")
    }

    fun follow(followerId: Int, followeeId: Int): Unit {
        TODO("Implement follow")
    }

    fun unfollow(followerId: Int, followeeId: Int): Unit {
        TODO("Implement unfollow")
    }
}

fun main() {
    runTests(
        "follow and unfollow" to {
            val t = Twitter(); t.postTweet(1, 10); t.follow(1, 2); t.postTweet(2, 20); expect(listOf(20, 10), t.getNewsFeed(1)); t.unfollow(1, 2); expect(listOf(10), t.getNewsFeed(1))
        },
        "ten most recent" to {
            val t = Twitter(); for (i in 1..12) t.postTweet(1, i); expect((12 downTo 3).toList(), t.getNewsFeed(1))
        },
        "empty and duplicate follow" to {
            val t = Twitter(); expect(emptyList<Int>(), t.getNewsFeed(9)); t.follow(1, 2); t.follow(1, 2); t.postTweet(2, 5); expect(listOf(5), t.getNewsFeed(1)); t.unfollow(1, 3)
        },
    )
}
