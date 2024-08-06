package com.example.myapplication

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.PriorityQueue

class num56 {
    @RequiresApi(Build.VERSION_CODES.N)
    fun test() {
        println(
            merge(
                arrayOf(
                    intArrayOf(9, 16),
                    intArrayOf(6, 16),
                    intArrayOf(1, 9),
                    intArrayOf(3, 15)
                )
            )
        )
    }


    @RequiresApi(Build.VERSION_CODES.N)
    fun merge(intervals: Array<IntArray>): Int {
//    var intervals1 =
        intervals.sortBy { it[0] }
        val pq = PriorityQueue<Int>(compareBy{it})
        pq.add(intervals[0][1])
        println(pq)
        for(i in 1 until intervals.size){
            println("${intervals[i][0]},${intervals[i][1]}")
            println("pq.peek=${pq.peek()}")
            if(pq.peek() <= intervals[i][0]) pq.poll()
            pq.add(intervals[i][1])
            println(pq)
        }

        return pq.size
    }
}