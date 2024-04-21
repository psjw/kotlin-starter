package com.lannstark.lec08

fun main(){
    repeat("Hello World")
    repeat("Hello World",3,false)
    //named argument
    repeat("Hello World", useNewLine = false)
    //파라미터 순서대로 넣어 주지 않을 경우
    printNameAndGender(name="A", gender = "MALE")
    printAll("A","B","C")
    val array = arrayOf("A","B","C")
    printAll(*array) //* spread연산자 배열안의 연산자를 ,를 사용하는것 같이 꺼내준다.
}

fun max(a: Int, b: Int) = if (a > b) a  else  b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true){
    for(i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String){
    println(name)
    println(gender)
}

fun printAll(vararg strings: String){
    for(str in strings){
        println(str)
    }
}
