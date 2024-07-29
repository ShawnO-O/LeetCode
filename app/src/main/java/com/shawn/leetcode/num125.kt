package com.shawn.leetcode

class num125 {
    fun main() {
        isPalindrome("ab2a")
    }

    fun isPalindrome(s: String): Boolean {
        if (s == "") {
            return true
        } else {
            val tmp = s.lowercase()
            var left = 0
            var right = s.length-1
            while (left < right ){
                if(tmp[left].isDigit()&& tmp[left].isLetter()){
                    left++
                    continue
                }

                if(tmp[right].isDigit() && tmp[right].isLetter()){
                    right--
                    continue
                }

                if(tmp[left].lowercase() != tmp[right].lowercase()){
                    return false
                }

                left++
                right--
            }
        }
        return true
    }
}