package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class test2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var aa = ""
        aa.let {

        }
    }

}

fun main() {
    var nums1 = IntArray(10)
//    nums1.plus
    var intArray = intArrayOf(0,0,1,1,1,1,2,3,3)
//    var intArray = intArrayOf(1)
    removeDuplicates(intArray)
}
fun removeDuplicates(nums: IntArray): Int {
//    var current = 0
    var times = 0
    var k = nums[0]
    var count = 0
    for(i in nums.indices){
        if(k == nums[i]){
            count++
        }else{
            nums[k] = nums[i]
        }
    }
    println(k)
    return k
}


fun removeElement(nums: IntArray, `val`: Int): Int {
    var currentPos = 0
    var leastPos = nums.size - 1
    var count = 0
//    if(nums.size == 1)
//        return 1
    while (currentPos < nums.size) {
        println("outlin currentPos:$currentPos")
        if (nums[currentPos] == `val`) {
            println("currentPos:$currentPos")
            println("leastPos:$leastPos")
            if (nums[leastPos] != `val`) {
//                val tmp = nums[currentPos]
                nums[currentPos] = nums[leastPos]
//                nums[leastPos] = tmp
                currentPos++
                leastPos--
            } else {
                leastPos--
            }
        } else {
            currentPos++
            count++
        }
        for(i in nums) {
            print("$i,")
        }
        println()
    }

    return count
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
//    for (i in nums1.ind)
    var all = m + n - 1
    var first = m - 1
    var second = n - 1
    while (second >= 0) {
        nums1[all--] =
            if (first >= 0 && nums1[first] > nums2[second]) nums1[first] else nums2[second--]
    }
//    return list
}
