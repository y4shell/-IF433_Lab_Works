package oop_Aryasha_Week11_Lab

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))
    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}