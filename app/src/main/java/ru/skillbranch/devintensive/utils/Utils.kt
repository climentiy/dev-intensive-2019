package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?): Pair<String?, String?> {
        val parts : List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)?.let { if (it.isEmpty()) null else it }
        var lastName = parts?.getOrNull(1)?.let { if (it.isEmpty()) null else it }
        return Pair(firstName, lastName)
/*
        val firstName = parts?.getOrNull( 0)
        val lastName = parts?.getOrNull( 1)
        return Pair(firstName, lastName)
        //return firstName  to lastName */
    }
}