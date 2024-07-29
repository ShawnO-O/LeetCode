package com.shawn.leetcode

class num1 {
    fun main() {
        twoSum(intArrayOf(1, 1, 1, 2, 3, 3, 3, 7, 11, 15), 9)
    }
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val diffMap = mutableMapOf<Int,Int>()
        //因為這是two sums 所以可以這樣判斷
        nums.forEachIndexed{ index,int->
            println("index: $index , int:$int")
            diffMap[int]?.let { return intArrayOf(it,index) }
            diffMap[target-int] =index
            println(diffMap)
        }
        return intArrayOf()
    }

}