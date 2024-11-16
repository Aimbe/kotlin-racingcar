package misson.car

class RacingCars(private val cars: List<RacingCar>) {
    fun moveAll(randomNumberGenerator: () -> Int) {
        cars.forEach { it.move(randomNumberGenerator) }
    }

    fun getPositions(): List<String> {
        return cars.map { it.representPostition() }
    }
}
