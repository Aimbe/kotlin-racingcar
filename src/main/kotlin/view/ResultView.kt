package view

object ResultView {
    fun printRoundResult(positions: List<String>) {
        positions.forEach { println(it) }
        println()
    }

    fun printWinner(winners: String) {
        println("최종 우승자는 $winners 입니다.")
    }
}
