package misson.car

@JvmInline
value class Winners(private val winners: List<RacingCar>) {
    fun getNames(): List<String> {
        return winners.map { it.name }
    }
}
