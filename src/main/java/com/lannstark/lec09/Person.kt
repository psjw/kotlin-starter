package com.lannstark.lec09

fun main(){
    val person = Person("최태현", 100)
    println(person.name) //getter
    person.age = 10; //setter
    println(person.age)

    //자바도 동일
    val javaPerson = JavaPerson("최태현", 100)
    println(javaPerson.name) //getter
    javaPerson.age = 10; //setter
    println(javaPerson.age)


    val person1 = Person("최태현")

    Student() //기본생성자는 자동으로 만들어줌
    Person()
}

//class Person constructor(name: String, age: Int) {
//constructor 생략 가능
//class Person (name: String, age: Int) {
//class Person (val name: String, var age: Int) {
class Person ( name: String, var age: Int) {
//class Person (val name: String, var age: Int) {
    //클래스가 생성자가 호출되는 시점에 한번 호출
    init {
        if(age<=0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    //custom setter
    var name = name
        set(value){
            field = value.uppercase()
        }

//    val name: String = name
//        get() = field.uppercase()

//    fun getUppercaseName(): String{
//        return this.name.uppercase()
//    }

//    val uppercaseName: String
//        get() = this.name.uppercase()

    //추가 생성자
    constructor(name: String): this(name, 1){
        println("첫 번째 부생성자")
    }

    constructor(): this("홍길동"){
        println("두 번째 부생성자")
    }

    //함수처럼
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    //property 형식
    //custom getter
//    val isAdult: Boolean
//        get() = this.age >= 20

    val isAdult: Boolean
        get() {
            return this.age >= 20
        }


//    val name: String = name
//    var age: Int = age
    //타입 생략 가능
    // (val name: String, var age: Int)로 대체 가능
//    val name = name
//    var age = age
    //Getter Setter 자동으로 만들어줌

}

class Student