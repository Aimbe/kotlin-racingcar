package misson.car

import view.InputView
import view.ResultView.printRoundResult
import view.ResultView.printWinner

fun main() {
    val carName = InputView.readCarName()
    val attempts = InputView.readAttempts()
    val playGame = PlayGame(carName, attempts)
    playGame.play()
}

class PlayGame(private val racingCars: RacingCars, private val attempts: Int) {
    constructor(carNames: String, attempts: Int) : this(
        racingCars = RacingCars(carNames.split(",").map { RacingCar(it) }),
        attempts = attempts,
    )

    fun play() {
        repeat(attempts) {
            racingCars.moveAll { (0..9).random() }
            printRoundResult(racingCars.getPositionsWithName())
        }

        printWinner(racingCars.findWinners().representWinners())
    }
}
