package misson

class RacingCar {
    var position: Int = 0
        private set


    fun move(randomNumberGenerator: () -> Int) {
        if (randomNumberGenerator() >= 4) {
            position++
        }
    }

}
