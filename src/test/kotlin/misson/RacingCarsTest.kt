package misson

import misson.car.RacingCar
import misson.car.RacingCars
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RacingCarsTest {
    @Test
    fun `자동차 그룹을 한번에 이동시킨다`() {
        val racingCars = RacingCars(List(3) { RacingCar() })
        racingCars.moveAll { 4 }

        val positions = racingCars.getPositions()
        assertThat(positions).containsExactly("-", "-", "-")
    }

    @Test
    fun `자동차 그룹을 값이 4이하 이면 이동하지 않는다`() {
        val racingCars = RacingCars(List(3) { RacingCar() })
        racingCars.moveAll { 3 }

        val positions = racingCars.getPositions()
        assertThat(positions).containsExactly("", "", "")
    }

    @Test
    fun `가장 멀리간 자동차가 우승한다`() {
        val racingCars =
            RacingCars(
                listOf(
                    RacingCar("car1", 3),
                    RacingCar("car2", 2),
                    RacingCar("car3", 1),
                ),
            )

        val winners = racingCars.findWinners()
        assertThat(winners.representWinners()).isEqualTo("car1")
    }

    @Test
    fun `postion이 여러차가 동일 할 시에 공동 우승한다`() {
        val racingCars =
            RacingCars(
                listOf(
                    RacingCar("car1", 3),
                    RacingCar("car2", 3),
                    RacingCar("car3", 2),
                ),
            )

        val winners = racingCars.findWinners()
        assertThat(winners.representWinners()).isEqualTo("car1, car2")
    }
}
