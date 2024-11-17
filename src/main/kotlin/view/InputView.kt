package view

object InputView {
    fun readCarCount(): Int {
        println("자동차 대수는 몇 대인가요?")
        return readln().toInt()
    }

    fun readCarName(): String {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표 기준으로 구분합니다.)")
        return readln()
    }

    fun readAttempts(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return readln().toInt()
    }
}
