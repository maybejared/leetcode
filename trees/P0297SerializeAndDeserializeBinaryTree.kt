// 297. Serialize And Deserialize Binary Tree — Hard
// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0297

import practice.*

class Codec {
    fun serialize(root: TreeNode?): String {
        TODO("Implement serialize")
    }

    fun deserialize(data: String): TreeNode? {
        TODO("Implement deserialize")
    }
}

fun main() {
    runTests(
        "sparse tree" to {
            val original = tree(4, -2, 9, null, 3, 8); val encoded = Codec().serialize(original); expectTree(treeValues(original), Codec().deserialize(encoded))
        },
        "empty tree" to {
            val original = null; val encoded = Codec().serialize(original); expectTree(treeValues(original), Codec().deserialize(encoded))
        },
        "duplicates" to {
            val original = tree(1, 1, 1); val encoded = Codec().serialize(original); expectTree(treeValues(original), Codec().deserialize(encoded))
        },
    )
}
