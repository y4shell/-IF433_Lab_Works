package oop_Aryasha_Week11_Lab

data class User(var name: String = "", var age: Int = 0)
fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)
    // CHECKPOINT 7: Commit "week11: implement apply for object initialization"

    println("\n=== TEST ALSO ===")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Log Sebelum ditambah: $it")
    }.add(4)
    println("Setelah ditambah: $numbers")
    // CHECKPOINT 8: Commit "week11: implement also for logging side effects"

    println("\n=== TEST WITH ===")
    with(user) {
        println("User Detail -> Nama: $name, Umur: $age")
    }
    // CHECKPOINT 9: Commit "week11: implement with function for multiple operations"

    val newUser = User("Budi", 20).apply {
        age = 21
    }.also {
        println("User baru berhasil dibuat: $it")
    }
    // CHECKPOINT 10: Commit "week11: combine apply and also in object setup"
}