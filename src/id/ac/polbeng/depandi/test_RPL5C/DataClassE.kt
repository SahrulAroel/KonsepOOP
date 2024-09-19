package id.ac.polbeng.depandi.test_RPL5C

fun main() {
    val meri = Student("Meri", 20)
    // Desctructuring Declataration
    val (name, age) = meri
    println("Name = $name")
    println("Age = $age")
}