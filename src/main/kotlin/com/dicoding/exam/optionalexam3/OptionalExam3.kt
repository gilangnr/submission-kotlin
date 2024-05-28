package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    require(int in 1..100) { "Integer input must be between 1 and 100" }

    return if (str.any { it.isDigit() }) {
        val digits = str.filter { it.isDigit() }.toInt()
        val nonDigits = str.filter { !it.isDigit() }
        val result = digits * int
        "$nonDigits$result"
    } else {
        "$str$int"
    }
}
