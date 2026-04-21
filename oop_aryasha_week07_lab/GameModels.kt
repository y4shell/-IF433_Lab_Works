package oop_aryasha_week07_lab

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(30),
    RARE(15),
    EPIC(5),
    LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)