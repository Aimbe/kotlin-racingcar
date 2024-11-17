package misson.car

class Winners(private val winners: List<RacingCar>) {
    fun getNames(): List<String> {
        return winners.map { it.name }
    }

    fun representWinners(): String {
        return getNames().joinToString(", ")
    }
}
