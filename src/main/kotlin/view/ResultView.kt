package view

object ResultView {
    fun printRoundResult(positions: List<String>) {
        positions.forEach { println(it) }
        println()
    }
}
