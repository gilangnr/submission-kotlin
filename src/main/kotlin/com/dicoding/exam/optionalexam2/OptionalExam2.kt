package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    require(number in 10..999999999)

    val digits = number.toString().map { it.toString().toInt()}
    val minDigit = digits.minOrNull() ?: 0
    val maxDigit = digits.maxOrNull() ?: 0
    return minDigit + maxDigit
}
