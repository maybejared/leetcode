package neetcode150.arrays_hashing.p0347

import practice.*

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val counter: Map<Int, List<Int>> = nums.asIterable().groupingBy { it }.eachCount().entries.groupBy(
            keySelector = { it.value },
            valueTransform = { it.key }
        )

        val bucket = MutableList(nums.size + 1) { mutableListOf<Int>() }
        for ((occ, numbers) in counter) {
            bucket[occ].addAll(numbers)
        }

        var count = 0
        val res = mutableListOf<Int>()

        outer@ for (i in bucket.indices.reversed()) {
            for (n in bucket[i]) {
                res.add(n)
                if (res.size == k) break@outer
            }
        }


        return res.toIntArray()
    }


}


fun main() {
    runTests(
        "case 1: intArrayOf(4, 4, 4, 2, 2, 9), 2" to {
            expectUnordered(intArrayOf(4, 2), Solution().topKFrequent(intArrayOf(4, 4, 4, 2, 2, 9), 2))
        },
        "case 2: intArrayOf(-1), 1" to {
            expectUnordered(intArrayOf(-1), Solution().topKFrequent(intArrayOf(-1), 1))
        },
        "case 3: intArrayOf(1, 2, 3), 3" to {
            expectUnordered(intArrayOf(1, 2, 3), Solution().topKFrequent(intArrayOf(1, 2, 3), 3))
        },
    )
}
