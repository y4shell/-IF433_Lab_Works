package oop_Aryasha_Week13_Lab

import java.io.File

fun main() {
    // LANGKAH 1: Praktik TANPA use (Manual Close)
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")

    val writer = unsafeFile.printWriter()
    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    writer.close()
    println("Proses penulisan unsafe selesai.")

    // LANGKAH 2: Praktik DENGAN use (Safe Handling)
    println("\n=== TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("safe_logs.txt")

    safeFile.printWriter().use { out ->
        for (i in 1..100) {
            out.println("Safe Log entry #$i: System status OK.")
        }
    }
    println("100 baris log berhasil di-generate dengan sangat aman.")

    // LANGKAH 3: Membaca Efisien dengan BufferedReader
    println("\n=== TEST BUFFERED READER ===")

    // Membaca stream tanpa me-load seluruh file ke RAM
    safeFile.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach { line ->
            println("Stream Read: $line")
        }
    }

}