package misson.car

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WinnerTest {
    @Test
    fun `우승자 이름을 반환한다`() {
        val winners =
            Winners(
                listOf(
                    RacingCar("car1"),
                    RacingCar("car2"),
                ),
            )

        assertThat(winners.representWinners()).isEqualTo("car1, car2")
    }
}
