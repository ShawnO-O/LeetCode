package com.shawn.leetcode

class num383 {
    fun main() {
        canConstruct("aab", "baa")
    }
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineArray = magazine.toCharArray().toMutableList()
        val noteArray = ransomNote.toCharArray()
        for(i in noteArray){
            if(!magazineArray.remove(i)){
                return false
            }
        }
        return true
    }
}