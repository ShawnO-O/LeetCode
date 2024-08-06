package com.shawn.leetcode

class tictok5 {
        fun test() {
            println(longestPalindrome("babababd"))
        }

        fun longestPalindrome(s: String): String {
            var result = ""

            if (s.length <= 1) {
                return s
            }

            var maxLen = 1
            var maxStr = s.substring(0, 1)
            println(maxStr)



//    for (i in s.indices) {
//        try {
//            val odd = expandFromCenter("odd",s, i, i)
//            val even = expandFromCenter("even",s, i, i + 1)
//            if (odd.length > maxStr.length) {
//                maxStr = odd
//            }
//            if (even.length > maxStr.length) {
//                maxStr = even
//            }
//            println("maxStr:$maxStr")
//        }catch (e:Exception){
//            println("e:$e")
//        }
//    }

//    for(i in 0..s.length){
//        println("18:$i , maxLen:$maxLen")
//        for (j in i + maxLen..s.length) {
//            println("20:$j maxLen:$maxLen")
//            if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
//                maxLen = j - i
//                maxStr = s.substring(i, j)
//                println("24:$maxStr")
//            }
//        }
//    }
            println(maxStr)
            return maxStr
        }

        fun expandFromCenter(type:String,s: String, left: Int, right: Int): String {
            println("$type s:$s,left:$left,right:$right")
            var _left: Int = left
            var _right: Int = right
            while (_left >= 0 && _right < s.length && s[_left] == s[_right]) {
                _left--
                _right++
            }
            return s.substring(_left + 1, _right)
        }

        fun isPalindrome(str: String): Boolean {
            var left = 0
            var right = str.length - 1
            while (left < right) {
                if (str[left] != str[right]) {
                    return false
                }
                left++
                right--
            }
            return true
        }

}