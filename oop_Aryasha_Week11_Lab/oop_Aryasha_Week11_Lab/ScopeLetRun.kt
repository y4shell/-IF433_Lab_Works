package oop_Aryasha_Week11_Lab

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Gunakan Elvis Operator (?: 0) agar length memiliki nilai default jika null
    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    } ?: 0 // Jika name null, length akan bernilai 0

    println("Panjang nama: $length")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        // Sekarang length sudah pasti Int (bukan Int?), jadi tidak error lagi
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}