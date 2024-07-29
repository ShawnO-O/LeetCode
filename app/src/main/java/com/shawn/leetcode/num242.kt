package com.shawn.leetcode

class num242 {
    fun main() {
        isAnagram("anagram", "nagaram")
    }

    fun isAnagram(s: String, t: String): Boolean {
        val chars = t.toMutableList()
        for (i in s.indices) {
            if (!chars.remove(s[i]))
                return false
        }
        return chars.size == 0
    }

    fun isAnagramEfficient(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val sMap = mutableMapOf<Char,Int>()
        val tMap = mutableMapOf<Char,Int>()

        for(c in s){
            sMap[c] = sMap.getOrDefault(c,0)+1
        }

        for(c in t){
            tMap[c] = tMap.getOrDefault(c,0)+1
        }
        return sMap == tMap
    }
}