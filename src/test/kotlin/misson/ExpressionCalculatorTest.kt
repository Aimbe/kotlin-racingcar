package misson

import mission.Expression
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ExpressionCalculatorTest {

    @ParameterizedTest
    @CsvSource(
        "1 + 2, 3.0",
        "2 - 1, 1.0",
        "2 * 3, 6.0",
        "6 / 2, 3.0",
        "1 + 2 + 3, 6.0",
        "2 * 3 + 4, 10.0",
        "10 - 5 + 3, 8.0",
        "10 / 2 * 3, 15.0",
        "1 + 2 * 3, 9.0",
        "10 - 2 * 3, 24.0",
        "10 - 2 * 3 * 5, 120.0",
    )
    fun `입력값을 정상적으로 수행한다`(input: String, expected: Double) {
        val expression = Expression.from(input)
        val calculator = ExpressionCalculator(expression)
        assertEquals(expected, calculator.calculate())
    }
}
