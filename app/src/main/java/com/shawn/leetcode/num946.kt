package com.example.myapplication

import java.util.Stack

class num946 {
    fun test() {
//    longestPalindrome("babad")
//    wallsAndGates(
//        arrayOf(
//            intArrayOf(2147483647, -1, 0, 2147483647),
//            intArrayOf(2147483647, 2147483647, 2147483647, -1),
//            intArrayOf(2147483647, -1, 2147483647, -1),
//            intArrayOf(0, -1, 2147483647, 2147483647)
//        )
//    )
//    println("bb")

        println(validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 5, 3, 2, 1)))
    }

    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val stack = Stack<Int>()
        var popPos = 0
        for (item in pushed) {
            stack.push(item)
            while (stack.isNotEmpty() && stack.peek() == popped[popPos]) {
                popPos++
                stack.pop()
            }
        }

        return stack.isEmpty()
    }
}