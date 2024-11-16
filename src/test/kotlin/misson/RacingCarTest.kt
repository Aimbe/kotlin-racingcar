package misson

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RacingCarTest {

    @Test
    fun `무작위 값이 4이상일때 전진한다`() {

        RacingCar().apply {
            move { 4 }
            assertThat(position).isEqualTo(1)
        }
    }

    @Test
    fun `무작위 값이 4보다 작으면 전진하지 않는다`() {

        RacingCar().apply {
            move { 3 }
            assertThat(position).isEqualTo(0)
        }
    }

}
