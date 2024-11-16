package misson.calculator

data class Expression(val numbers: List<Double>, val operators: List<String>) {
    init {
        validate()
    }

    private fun validate() {
        validateSize()
        validateOperators()
    }

    private fun validateSize() {
        if (numbers.isEmpty()) {
            throw IllegalArgumentException("입력값이 없습니다.")
        }
        if (numbers.size <= 1) {
            throw IllegalArgumentException("입력값이 하나입니다.")
        }
        if (numbers.size != operators.size + 1) {
            throw IllegalArgumentException("수식의 형태가 올바르지 않습니다.")
        }
    }

    private fun validateOperators() {
        operators.forEach { operator ->
            Operator.from(operator)
        }
    }

    companion object {
        private const val EXPRESSION_SEPERATOR = " "

        fun from(input: String): Expression {
            val tokens = input.split(EXPRESSION_SEPERATOR)

            val numbers = tokens.filterIndexed { index, _ -> index % 2 == 0 }.map { it.toDouble() }
            val operators = tokens.filterIndexed { index, _ -> index % 2 == 1 }

            return Expression(numbers, operators)
        }
    }
}
