package com.example.myapplication

class tiktok {
    fun main() {
        test()
    }
}


fun test() {
    val input = listOf("abce", "sfcs","adee")
    val array2D = input.map { it.toCharArray() }.toTypedArray()
    println(exist(array2D, "see"))
}

fun exist(board: Array<CharArray>, word: String): Boolean {
    val dp = Array(board.size) { BooleanArray(board[0].size) { false } }
    for (row in board.indices) {
        for (rowChar in board[0].indices) {
            if (board[row][rowChar] == word[0]) {
                //取得了初始位置
//                if(
                println(findNextWord(row, rowChar, board, 0, word, dp))
//                    ) return true
            }
        }
    }
    return false
}

fun findNextWord(
    m: Int,
    n: Int,
    board: Array<CharArray>,
    currentPos: Int,
    word: String,
    dp: Array<BooleanArray>
): Boolean {
    for(item in dp){
//        println("item:$item")
        for(i in 0 until dp[0].size){
            print("${item[i]},")
        }
        println()
    }

    println("------------")
    println()
    if (m < 0 || m >= board.size || n < 0 || n >= board[0].size ||
        dp[m][n] || currentPos >= word.length || board[m][n] != word[currentPos]
    ) {
        return false
    }
    if(currentPos == word.length-1) return true
    dp[m][n] = true
    if (findNextWord(m - 1, n, board, currentPos + 1, word, dp) ||
        findNextWord(m, n + 1, board, currentPos + 1, word, dp) ||
        findNextWord(m + 1, n, board, currentPos + 1, word, dp) ||
        findNextWord(m, n - 1, board, currentPos + 1, word, dp)
    )
        return true
    dp[m][n] = false
    return false
}