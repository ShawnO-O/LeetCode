package com.example.myapplication

class num400 {
    fun test() {
        println(findNthDigit(15))
    }


    fun findNthDigit(n: Int): Int {
        // Step 1: Calculate the length of each group
        var count = 9
        var digits = 1
        var base = 1
        var _n = n
        while (_n > count * digits) {
            println("in: $_n, $count, $digits")
            _n -= count * digits
            count *= 10
            digits++
            base *= 10
        }
        println("out: $_n, $count, $digits, $base")
        // Step 2: Determine which group the nth digit belongs to
        val num = base + (_n - 1) / digits
        println("num: $num = $base + ($_n - 1) / $digits")
        // Step 3: Find the actual number that contains the nth digit
        val index = (_n - 1) % digits
        println("index: $index = ($_n - 1) % $digits")
        println("result ${num.toString()[index]} - '0'")
        // Step 4: Extract the nth digit from the number found in step 3
        return num.toString()[index] - '0'
    }
}