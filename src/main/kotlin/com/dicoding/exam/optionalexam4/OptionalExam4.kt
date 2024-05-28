package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    require(string.length in 1..100) { "Input string length must be between 1 and 100" }

    val middleIndex = string.length / 2
    return if (string.length % 2 == 0) {
        string.substring(middleIndex - 1, middleIndex + 1)
    } else {
        string.substring(middleIndex, middleIndex + 1)
    }
}
