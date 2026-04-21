package oop_aryasha_week07_lab

fun main() {
    println("=== SIMULASI SINGLETON ===")
    GameManager.startGame()
    GameManager.startGame() // Test duplikasi

    println("\n=== SIMULASI ENUM & FACTORY ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name} | Damage: ${starterWeapon.item.damage}")

    println("\n=== SIMULASI IMMUTABILITY (COPY) ===")
    // Upgrade damage menggunakan copy()
    val upgradedItem = starterWeapon.item.copy(name = "Pedang Kayu Tajam", damage = 25)
    println("Hasil upgrade: $upgradedItem")

    println("\n=== SIMULASI EVENT DISPATCH ===")
    processEvent(SafeZone)
    processEvent(MonsterEncounter("Goblin Nakal"))
    processEvent(LootDropped(upgradedItem))
    processEvent(GameOver("Terkena jebakan racun"))
}
