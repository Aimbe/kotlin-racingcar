package misson.car

class RacingCar {
    var position: Int = 0
        private set

    fun move(randomNumberGenerator: () -> Int) {
        if (randomNumberGenerator() >= 4) {
            position++
        }
    }

    fun representPostition(): String {
        return "-".repeat(position)
    }
}
