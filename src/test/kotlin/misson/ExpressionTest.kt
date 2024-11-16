package misson

import misson.calculator.Expression
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ExpressionTest {
    @Test
    fun `정상적인 문자열로부터 Expression 객체를 정상적으로 생성한다`() {
        val expression = Expression.from("1 + 2 * 3")

        assertThat(listOf(1.0, 2.0, 3.0)).isEqualTo(expression.numbers)
        assertThat(listOf("+", "*")).isEqualTo(expression.operators)
    }

    @Test
    fun `빈 값 입력 시 오류를 발생시킨다`() {
        assertThrows<IllegalArgumentException>("입력값이 없습니다.") {
            Expression(emptyList(), emptyList())
        }
    }

    @Test
    fun `숫자가 하나뿐인 경우 오류를 발생시킨다`() {
        assertThrows<IllegalArgumentException>("입력값이 하나입니다.") {
            Expression(listOf(1.0), emptyList())
        }
    }

    @Test
    fun `숫자와 연산자 개수가 맞지 않으면 오류를 발생시킨다`() {
        assertThrows<IllegalArgumentException>("수식의 형태가 올바르지 않습니다.") {
            Expression(listOf(1.0, 2.0), listOf("+", "*"))
        }
    }
}
