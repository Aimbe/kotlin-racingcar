package misson.calculator

class ExpressionCalculator(private val expression: Expression) {
    fun calculate(): Double {
        var result = expression.numbers.first()

        expression.operators.forEachIndexed { index, operatorSymbol ->

            val nextNumber = expression.numbers[index + 1]
            result = Operator.from(operatorSymbol).calculate(result, nextNumber)
        }
        return result
    }
}
