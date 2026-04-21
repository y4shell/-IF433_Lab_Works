package oop_Aryasha_Week09_Lab

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 12.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 50, -25.0, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 15, 8.3, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 4.5, "OPEN"),
        TradeLog("DOTUSDT", "SHORT", 10, -2.1, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\n--- TOP PERFORMERS ---")
    topPerformersString.forEach { println(it) }

    println("\n--- WORST PERFORMERS ---")
    worstPerformersString.forEach { println(it) }

    println("\n--- UNIQUE PAIRS TRADED ---")
    println(uniquePairs)

}