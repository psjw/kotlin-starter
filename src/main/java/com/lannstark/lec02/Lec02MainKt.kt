package com.lannstark.lec02

fun main(){

    val str : String? = "ABC"
    //println(str.length) //null 가능한 메서드는 실행 안됨
    println(str?.length) //null이 아니면 뒤에 함수 실행 아니면 null반환

    val str2 : String? = null
    println(str2?.length ?: 0) //?: Elvis 연산자 - null이면 뒤의 값을 사용

    println(startWith("A"));

    val person = Person("공부하는 개발자")
//    startWithA(person.name) //@Nullable Annotation 정보를 인지
}

fun startWithA(str: String): Boolean{
    return str.startsWith("A ")
}

fun startWithA1(str: String?): Boolean{
    if(str == null){
        throw IllegalArgumentException("null이 들어 왔습니다.")
    }
    return str.startsWith("A")
}
fun startWithA1_1(str: String?): Boolean{
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어 왔습니다.")
}

fun startWithA2(str: String?): Boolean?{
    if(str == null ){
        return null
    }

    return str.startsWith("A")
}

fun startWithA2_1(str: String?): Boolean?{
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    if(str == null){
        return false
    }
    return str.startsWith("A")
}

fun startWithA3_1(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean{
    //!! 절대 null이 올 수 없음
    return str!!.startsWith("A")
}