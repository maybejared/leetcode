package neetcode.p0036

import practice.*

class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val columns = Array(9) { mutableSetOf<Int>() }
        val boxes = Array(9) { mutableSetOf<Int>() }

        board.forEachIndexed outter@{ i: Int, arr: CharArray ->
            val row = mutableSetOf<Int>()
            arr.forEachIndexed inner@{ j: Int, value: Char ->
                // Parse char
                parse(value).run {
                    if (this == null) return@inner

                    // Check for duplicates in row & build col & block set
                    if (row.contains(this)) return false
                    // Build out columns & check for duplicates
                    row.add(this).also {
                        columns[j].also { column: MutableSet<Int> ->
                            if (column.contains(this)) return false
                            column.add(this)
                        }
                        // Build out block set & check for duplicates
                        boxes[(i / 3) * 3 + j / 3].also { box: MutableSet<Int> ->
                            if (box.contains(this)) return false
                            box.add(this)
                        }

                    }
                }

            }
        }

        return true
    }

    private fun parse(value: Char): Int? {
        if (value == '.') return null
        return value.digitToIntOrNull()
    }

}

fun main() {
    runTests(
        "valid sparse board" to {
            val b = Array(9) { CharArray(9) { '.' } }; b[0][0] = '1'; b[1][3] = '1'; expect(
            true,
            Solution().isValidSudoku(b)
        )
        },
        "duplicate row" to {
            val b = Array(9) { CharArray(9) { '.' } }; b[0][0] = '5'; b[0][4] = '5'; expect(
            false,
            Solution().isValidSudoku(b)
        )
        },
        "duplicate column" to {
            val b = Array(9) { CharArray(9) { '.' } }; b[0][0] = '3'; b[4][0] = '3'; expect(
            false,
            Solution().isValidSudoku(b)
        )
        },
        "duplicate box" to {
            val b = Array(9) { CharArray(9) { '.' } }; b[0][0] = '8'; b[1][1] = '8'; expect(
            false,
            Solution().isValidSudoku(b)
        )
        },
    )
}
