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
}
