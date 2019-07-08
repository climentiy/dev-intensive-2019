package ru.skillbranch.devintensive.extensions

import java.lang.IllegalStateException
import java.text.SimpleDateFormat
import java.util.*

const val SEKOND = 1000L
const val MINUTE = 60 * SEKOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

fun Date.format(pattern:String="HH.mm.ss dd.MM.yy"):String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value:Int, TimeUnits:String) : Date {
    var time = this.time

    time += when(TimeUnits){
        "second","seconds" -> value * SEKOND
        "minute","minuets" -> value * MINUTE
        "hour","hours" -> value * HOUR
        "day","days" -> value * DAY
        else -> throw IllegalStateException("invalid units")
    }
    this.time = time
    return this
}