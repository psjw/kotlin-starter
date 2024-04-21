package com.lannstark.lec03

fun main(){
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L

    printAgeIfPersonObj(Person("", 100))
    printAgeIfPersonObj(null)

    val person = Person("AAA",100)
    println("이름 : ${person.name}")
    val name = "BBB"
    println("이름 : $name")
    val str= """
     ABC
     EFG
     ${name}
    """.trimIndent()
    println(str)

    val str1 = "ABCD"
    println(str1[0])
    println(str1[2])
}

fun printAgeIfPerson(obj: Any){
    if(obj is Person){
        val person = obj as Person; //as Person생략 가능
        println(person.age)
    }
}

fun printAgeIfNotPerson(obj: Any){
    if(obj !is Person){
        val person = obj as Person; //as Person생략 가능
        println(person.age)
    }
}

fun printAgeIfPersonObj(obj: Any?){
    val person = obj as? Person; //as? null이 아니면 Person, value가  null or Type이 아니면 null
    println(person?.age) //Person? 타입
}