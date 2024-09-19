package id.ac.polbeng.depandi.test_RPL5C

data class Student (val name: String, val age: Int)

fun main() {
    val boni = Student("Boni", 21)
    val meri = Student("Meri", 20)
    println("Student Name is : ${boni.name}")
    println("Student Age is : ${boni.age}")
    println("Student Name ui : ${meri.name}")
    println("Student Age is : ${meri.age}")
}