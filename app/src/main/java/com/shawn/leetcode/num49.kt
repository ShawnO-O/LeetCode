package com.shawn.leetcode

class num49 {
    fun main() {
        groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
    }
    fun groupAnagrams(strs: Array<String>): List<List<String>>
            =  strs.groupBy { str -> str.groupingBy { it }.eachCount() }.values.toList()

    //這個好像比較好理解...
    fun groupAnagrams2(strs: Array<String>): List<List<String>>{
        return strs.groupBy { it.toCharArray().sorted() }.map { it.value }
    }
}