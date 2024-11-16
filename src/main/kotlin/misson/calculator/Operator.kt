package misson.calculator

enum class Operator(private val symbol: String) {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    ;

    fun calculate(
        num1: Double,
        num2: Double,
    ) = when (this) {
        PLUS -> num1 + num2
        MINUS -> num1 - num2
        MULTIPLY -> num1 * num2
        DIVIDE -> num1 / num2
    }

    companion object {
        fun from(symbol: String) =
            entries.find { it.symbol == symbol }
                ?: throw IllegalArgumentException("지원하지 않는 연산자입니다: $symbol")
    }
}
