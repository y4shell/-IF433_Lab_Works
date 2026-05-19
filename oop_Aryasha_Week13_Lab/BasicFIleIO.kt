package oop_Aryasha_Week13_Lab

import java.io.File

fun main() {
    // LANGKAH 1: Menulis ke File (writeText)
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis.")

    // LANGKAH 2: Menambah Isi File (appendText) [cite: 20]
    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Teks berhasil di-append.")

    // LANGKAH 3: Membaca Isi File (readText & readLines) [cite: 25]
    println("\n=== TEST READ TEXT ===")
    val fullContent = file.readText()
    println("Membaca sekaligus:\n$fullContent")

    println("=== TEST READ LINES ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("Isi Index $index: $line")
    }


}