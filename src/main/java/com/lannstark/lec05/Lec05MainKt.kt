package com.lannstark.lec05

fun validateScoreIsNotNegative(score: Int) {//Unit(Void)생략
    if (score !in 0..100) {
//        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
        throw IllegalArgumentException("score 범위는 0부터 100입니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun validate(score: Int) {
    if (score in 1..100) {
        println()
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}
