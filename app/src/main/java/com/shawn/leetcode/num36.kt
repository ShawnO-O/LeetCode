package com.shawn.leetcode

class num36 {

  fun main() {
        isValidSudoku(
            arrayOf(
                charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
                charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
                charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
                charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
                charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
                charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
                charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
                charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
            )
        )
    }

    fun isValidSudoku(board: Array<CharArray>): Boolean {

        for (col in board.indices) {
            val columnSet = mutableSetOf<Char>()
            val rowSet = mutableSetOf<Char>()
            val subBox = mutableSetOf<Char>()
            for (row in board.indices) {
                val c = board[col][row]
                val r = board[row][col]

                if (c != '.' && !columnSet.add(c)) return false
                if (r != '.' && !rowSet.add(r)) return false

                val colindex = 3 * (col % 3) + row % 3
                val rowindex = 3 * (col / 3) + row / 3
                println("$colindex $rowindex")
                val b = board[colindex][rowindex]

                if (b != '.' && !subBox.add(b)) return false
            }
            println("------------------------")
        }

        return true
    }
}