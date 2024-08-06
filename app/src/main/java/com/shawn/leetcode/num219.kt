package com.shawn.leetcode

class num219 {
    fun main() {
        containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 1)
    }
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
//    nums.forEachIndexed()
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val num = nums[i]
            if (map.containsKey(num) && i - map.get(num)!! <= k) return true
            map.put(num, i)
            println(map)
        }

        return false
    }
}