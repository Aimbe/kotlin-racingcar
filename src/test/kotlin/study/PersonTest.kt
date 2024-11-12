package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun `이름 붙인 인자`() {
        val person = Person(name = "홍길동", age = 30, nickname = "홍")
        assertThat(person.name == "홍길동")
    }

    @Test
    fun `널 타입`() {
        val acutal = Person(name = "홍길동", age = 20)
        assertThat(acutal.nickname).isEqualTo("홍길동")
    }

    @Test
    fun `데이터 클래스`() {
        val person1 = Person(name = "홍길동", age = 20)
        val person2 = Person(name = "홍길동", age = 20)
        assertThat(person1).isEqualTo(person2)
    }
}
