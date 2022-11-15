package com.android.example.bingo

import kotlin.random.Random

class BingoManager {
    var range = (1..75).toMutableList()
    var totalNum = mutableListOf<Int>()

    fun start(): String? {
        if (range.isEmpty()) {
            return null
        } else {
            val randomIndex = Random.nextInt(range.size)
            val result: Int = range[randomIndex]
            totalNum.add(result)
            range.remove(result)
            return result.toString()
        }

    }

    fun result(): String {
        val total = totalNum.toString()
            .replace("[", "")
            .replace("]", "")
        return total
    }
}