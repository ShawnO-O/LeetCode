package com.shawn.leetcode

class num128 {
    fun main() {
        println(longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)))
    }
    fun longestConsecutive(nums: IntArray): Int {
        //hashset會自動排序@@....
        val map = nums.toHashSet()
        var max = 0

        for(num in nums){
            if(!map.contains(num)){
                continue
            }

            var left = num
            var right = num

            while (map.contains(--left)){
                map.remove(left)
            }
            while(map.contains(++right)){
                map.remove(right)
            }
            var count = right-left-1
            if(count > max){
                max = count
            }
        }
        return max
    }
}