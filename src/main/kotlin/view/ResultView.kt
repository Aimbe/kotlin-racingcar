package view

import misson.car.CarPositionFormatter
import misson.car.RacingCars
import misson.car.Winners

object ResultView {
    fun printRoundResult(racingCars: RacingCars) {
        racingCars.cars
            .map { CarPositionFormatter.formatCarPosition(it) }
            .forEach { println(it) }
        println()
    }

    fun printWinner(winners: Winners) {
        val winnerNames = winners.getNames().joinToString(", ")
        println("최종 우승자는 $winnerNames 입니다.")
    }
}
