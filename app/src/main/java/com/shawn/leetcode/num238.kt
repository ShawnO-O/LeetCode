package com.example.myapplication

class num238 {
    fun test() {
        println(productExceptSelf(intArrayOf(-1, 1, 0, -3, 3)))
    }

    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val left = IntArray(nums.size) { 1 }
        val right = IntArray(nums.size) { 1 }

        for (i in 1 until n) {
            left[i] = left[i - 1] * nums[i - 1]
        }

        for (i in n-2 downTo 0) {
            right[i] = right[i + 1] * nums[i + 1]
        }

        val result = IntArray(n) { 0 }
        for (i in 0 until n) {
            result[i] = left[i] * right[i]
        }
//自己解
//    var x = 1
//    nums.map { x *= it }
//    val result = mutableListOf<Int>()
//    for (i in nums.indices) {
//        if (nums[i] == 0) {
//            var y = 1
//            for (item in nums.indices) {
//                if (item != i)
//                    y *= nums[item]
//            }
//            result.add(y)
//        } else
//            result.add(x / nums[i])
//    }
        return result
    }
}