package com.shawn.leetcode

class num205 {
}

fun main() {
    var s = "badc"
    var t = "baba"
    val hashMap = HashMap<Char,Char>()
    val sArray = s.toCharArray()
    val tArray = t.toCharArray()
    var result = true
    for(i in sArray.indices){
        if(hashMap.contains(sArray[i]) || hashMap.values.contains(tArray[i])){
            if(hashMap[sArray[i]] != tArray[i]){
                result = false
                println("worng!")
                break
            }
        }else{
            hashMap[sArray[i]] = tArray[i]
        }
    }
    println(result)
}