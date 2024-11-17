package misson.car

class RacingCar(private val name: String = "붕붕이", private var position: Int = 0) {
    init {
        require(name.length in 1..5) { "이름은 1자 이상 5자 이하여야 합니다." }
    }

    fun move(randomNumberGenerator: () -> Int) {
        if (randomNumberGenerator() >= 4) {
            position++
        }
    }

    fun representPostition(): String {
        return "-".repeat(position)
    }
}
