package com.example.myapplication

class num152 {
    fun test() {
        println(maxProduct(intArrayOf(2,3,-2,4)))
    }

    fun maxProduct(nums: IntArray): Int {
        var res = nums.max()
        var min = 1
        var max = 1
        for (n in nums) {
            val temp = min * n
            //這邊主要取得負數，因為有可能負負得正
            min = minOf(n * max, n * min, n)
            max = maxOf(n * max, temp, n)

            res = maxOf(res,max)
        }

        return res
    }
}