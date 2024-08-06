package com.shawn.leetcode

class num202 {
    fun main() {
        isHappy(19)
    }
    fun isHappy(n: Int): Boolean {
        println(n%10)
        println(n/10)
        return when(n){
            1 -> true
            4 -> false
            else -> isHappy(nextInt(n))
        }
    }

    fun nextInt(n:Int):Int{
        var sum = 0
        var _n = n
        while (_n>0){
            val digit = _n % 10
            sum += digit*digit
            _n /=10
        }
        return sum
    }
}