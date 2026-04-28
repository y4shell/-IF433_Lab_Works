package oop_Aryasha_Week10_Lab

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) { items.add(item) }
    fun getAll(): List<T> = items

    // Logic pencarian sederhana (Constraint <T: Any>)
    fun search(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}