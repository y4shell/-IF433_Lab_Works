package oop_Aryasha_Week10_Lab

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}

// Letakkan fungsi ini di luar class MathBox agar bisa dipanggil langsung di Main.kt
fun <T> getMax(a: T, b: T): T where T : Comparable<T> {
    return if (a > b) a else b
}