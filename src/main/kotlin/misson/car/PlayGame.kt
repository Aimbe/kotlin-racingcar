package misson.car

import view.InputView
import view.ResultView.printRoundResult

fun main() {
    val carCount = InputView.readCarCount()
    val attempts = InputView.readAttempts()

    val carList = List(carCount) { RacingCar() }
    val playGame = PlayGame(RacingCars(carList), attempts)

    playGame.play()
}

class PlayGame(private val racingCars: RacingCars, private val attemtps: Int) {
    fun play() {
        repeat(attemtps) {
            racingCars.moveAll { (0..9).random() }
            printRoundResult(racingCars.getPositions())
        }
    }
}
