package misson

import misson.calculator.Operator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class OperatorTest {
    @Test
    fun `정상적인 연산자 입력시 변환한다`() {
        val operators =
            listOf(
                "+" to Operator.PLUS,
                "-" to Operator.MINUS,
                "*" to Operator.MULTIPLY,
                "/" to Operator.DIVIDE,
            )

        operators.forEach { (symbol, expectedOperator) ->
            assertEquals(expectedOperator, Operator.from(symbol))
        }
    }

    @Test
    fun `잘못된 연산자 입력시 오류를 표출한다`() {
        assertThrows<IllegalArgumentException> {
            Operator.from("%")
        }.let {
            assertEquals("지원하지 않는 연산자입니다: %", it.message)
        }
    }
}
