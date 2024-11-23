package view

import misson.car.CarPositionFormatter
import misson.car.RacingCars

object ResultView {
    fun printRoundResult(racingCars: RacingCars) {
        racingCars.cars
            .map { CarPositionFormatter.formatCarPosition(it) }
            .forEach { println(it) }
        println()
    }

    fun printWinner(winners: String) {
        println("최종 우승자는 $winners 입니다.")
    }
}
