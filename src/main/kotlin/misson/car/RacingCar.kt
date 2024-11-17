package misson.car

// 코틀린 문법에서 position을 private으로 하지 않아도 내부적으로는 getter로 접근
class RacingCar(val name: String = "붕붕이", var position: Int = 0) {
    init {
        validateName(name)
    }

    private fun validateName(name: String) {
        if (name.length > 5) {
            throw IllegalArgumentException("이름은 5자 이하만 가능합니다.")
        }

        if (name.isBlank()) {
            throw IllegalArgumentException("이름은 공백일 수 없습니다.")
        }
    }

    fun move(randomNumberGenerator: () -> Int) {
        if (randomNumberGenerator() >= 4) {
            position++
        }
    }

    fun representPostition(): String {
        return "-".repeat(position)
    }

    fun representPostitionWithName(): String {
        return "자동차 " + name + " : " + "-".repeat(position)
    }
}
