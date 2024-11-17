package misson.car

import view.InputView
import view.ResultView.printRoundResult

fun main() {
    val carCount = InputView.readCarCount()
    val attempts = InputView.readAttempts()

    val playGame = PlayGame(carCount, attempts)

    playGame.play()
}

class PlayGame(private val racingCars: RacingCars, private val attempts: Int) {
    constructor(carCount: Int, attemtps: Int) : this(
        racingCars = RacingCars(List(carCount) { RacingCar() }),
        attempts = attemtps,
    )

    fun play() {
        repeat(attempts) {
            racingCars.moveAll { (0..9).random() }
            printRoundResult(racingCars.getPositions())
        }
    }
}
