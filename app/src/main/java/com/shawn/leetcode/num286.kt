package com.example.myapplication

class num286 {

    fun test() {
//    longestPalindrome("babad")
    wallsAndGates(
        arrayOf(
            intArrayOf(2147483647, -1, 0, 2147483647),
            intArrayOf(2147483647, 2147483647, 2147483647, -1),
            intArrayOf(2147483647, -1, 2147483647, -1),
            intArrayOf(0, -1, 2147483647, 2147483647)
        )
    )
//    println("bb")

//        println(validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 5, 3, 2, 1)))
    }

    fun wallsAndGates(rooms: Array<IntArray>): Unit {
        val _rooms = rooms
        try {
            ///從gate出發
            for (m in rooms.indices) {
                for (n in rooms[m].indices) {
                    if (rooms[m][n] == 0) {
                        go(m + 1, n, rooms, 1)
                        go(m, n + 1, rooms, 1)
                        go(m - 1, n, rooms, 1)
                        go(m, n - 1, rooms, 1)
                    }
                }
            }
        } catch (e: Exception) {
            println("e:$e")
        }
        for (m in _rooms.indices) {
            for (n in _rooms[m]) {
                print("$n,")
            }
            println()
        }
    }

    fun go(m: Int, n: Int, rooms: Array<IntArray>, times: Int) {
        if (m < 0 || m >= rooms.size || n < 0 || n >= rooms[0].size || rooms[m][n] == -1 || times >= rooms[m][n] || rooms[m][n] == 0) {
            return
        }
        rooms[m][n] = times
        go(m + 1, n, rooms, times + 1)
        go(m, n + 1, rooms, times + 1)
        go(m - 1, n, rooms, times + 1)
        go(m, n - 1, rooms, times + 1)
    }
}