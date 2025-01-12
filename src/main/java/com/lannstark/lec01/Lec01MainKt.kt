package com.lannstark.lec01

class Lec01MainKt {
}

fun main() {
    var number1 = 10L
    number1 = 5L

    val number2 = 10L
    //number2 = 5L

    var number3: Long = 11L

    var number4: Long
//        println(number4) //초기화 되지 않아서 오류
    number4 = 10L
    println(number4)
    //초기값 지정 안하면 타입을 지정해주어야됨
    val number5: Long
    number5 = 10L //최초 1번은 값을 넣어줄수 있음

    var number6: Long = 10L //내부적으로 primitive Type으로 변환하여 계산

    var number7: Long? = 1_000L
    number7 = null // Type?를 붙여줘야 null이 들어감

    var persson = Person("최태현")

}
