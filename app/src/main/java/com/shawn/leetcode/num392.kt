package com.shawn.leetcode

class num392 {
}
fun main(){
    var s = "axc"
    var t = "ahbgdc"
    val sArray = s.toCharArray()
    var currentPos = 0
    var result = true
    for(i in sArray.indices){
        if(i == 0 && (s.length == t.length)){
            if(t.indexOf(sArray[i]) != i){
                result = false
                break
            }
        }else if(t.indexOf(sArray[i]) < currentPos){
            result = false
            break
        }else{
            currentPos = t.indexOf(sArray[i])
        }
    }
    return result
    println(result)
}
