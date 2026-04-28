package oop_Aryasha_Week10_Lab

fun main() {
    // Inisialisasi & Isi Data Koin
    // Panggil nama class 'WalletRepository', bukan nama file '.kt'
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 500.0))

    // Simulasi Response Jaringan
    // Pastikan class ApiResponse sudah dibuat di file NetworkResponse.kt
    val response = ApiResponse("200 OK", coinRepo.getAll())

    // Menampilkan Data
    println("Status: ${response.status}")
    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    // Menambahkan Transaksi
    // Gunakan nama class 'WalletRepository' secara konsisten
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.5))
}