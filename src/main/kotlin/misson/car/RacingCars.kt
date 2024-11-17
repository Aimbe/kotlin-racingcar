package misson.car

class RacingCars(private val cars: List<RacingCar>) {
    fun moveAll(randomNumberGenerator: () -> Int) {
        cars.forEach { it.move(randomNumberGenerator) }
    }

    fun getPositions(): List<String> {
        return cars.map { it.representPostition() }
    }

    fun getPositionsWithName(): List<String> {
        return cars.map { it.representPostitionWithName() }
    }

    // 우승자를 찾는 객체의 책임
    fun findWinners(): Winners {
        val maxPosition = cars.maxOf { it.position }
        val winners = cars.filter { it.position == maxPosition }
        return Winners(winners)
    }
}
