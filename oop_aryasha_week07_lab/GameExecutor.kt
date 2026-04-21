package oop_aryasha_week07_lab

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Awas! Muncul monster: ${event.monsterName}")
        is LootDropped -> {
            // Destructuring atau Smart Cast
            println("Hore! Mendapat item: ${event.item.name} [Rarity: ${event.item.rarity}]")
        }
        is GameOver -> println("Game Over! Alasan: ${event.reason}")
        SafeZone -> println("Kamu berada di zona aman. Silakan beristirahat.")
    }
}
