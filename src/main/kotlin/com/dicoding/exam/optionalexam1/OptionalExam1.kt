package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    require(numbers.size in 1..10) {"Number of input must be between 1 and 10"}
    val sortedNumbers = numbers.sortedDescending()
    val topThreeNumbers = sortedNumbers.take(3)
    return topThreeNumbers.sum()
}
