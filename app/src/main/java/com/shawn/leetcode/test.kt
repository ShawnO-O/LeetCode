package com.shawn.leetcode


fun main() {
    var x = "12 30 AB CD 56 78 42 D4 B1 79 F2 CA 34 5D 67 89 A1 7B 64 BB"
    val y = ArrayList<String>()
    val values = x.split(" ")
    for (i in 0..8) {
        try {
            y.add(" ${values[i].toInt()}")
        } catch (e: NumberFormatException) {
            e.printStackTrace()
        }
    }
    if (y.size > 0) {
        //前16位元之間有10進位，所以只需移除16進制不轉換
        for (j in 9..values.size) {


        }
    } else {
        //前16位元之間沒有10進制，所以需要轉換16禁制by圖表
        x = x.replace("A", "0")
        x = x.replace("B", "1")
        x = x.replace("C", "2")
        x = x.replace("D", "3")
        x = x.replace("E", "4")
        x = x.replace("F", "5")
        for (i in 0..x.length) {
            try {
                if (y.size != 8) {
                    y.add(" ${values[i].toInt()}")
                } else {
                    break
                }
            } catch (e: NumberFormatException) {
                e.printStackTrace()
            }
        }
    }
    println(y)
}
