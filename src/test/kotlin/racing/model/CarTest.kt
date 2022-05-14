package racing.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class CarTest {

    @Test
    fun `create default car`() {
<<<<<<< HEAD
        //given
        val expected = "-"

        //when
        val result = Car().position

        //then
=======
        val result = Car().position
        val expected = "-"

>>>>>>> ef70116 (refactor: test package 구성 변경 및 Car model test 추가)
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `toString test`() {
<<<<<<< HEAD
        //given
        val expected = "-"

        //when
        val result = Car().toString()

        //then
=======
        val result = Car().toString()
        val expected = "-"

>>>>>>> ef70116 (refactor: test package 구성 변경 및 Car model test 추가)
        assertThat(result).isEqualTo(expected)
    }

    @ParameterizedTest
    @ValueSource(ints = [1,2,3,4,5])
    fun `go test`(loop: Int) {
<<<<<<< HEAD
        //given
        val expected = "-".repeat(loop)

        //when
        val result = List(loop - 1) { it }
            .fold(Car()) { acc, _ -> acc.go()}
            .toString()

        //then
        assertThat(result).isEqualTo(expected)
    }

    @ParameterizedTest
    @ValueSource(ints = [1,2,3,4,5])
    fun `goOrNot test`(targetNumber: Int) {
        //given
        val car = Car()
        val goOrNotNumber = checkGoOrNot(targetNumber)
        val expected = "-".repeat(goOrNotNumber)

        //when
        val result = car
            .goOrNot(targetNumber)
            .toString()

        //then
        assertThat(result).isEqualTo(expected)
    }

    private fun checkGoOrNot(num: Int) =
        if (num >= 4) {
            2
        } else {
            1
        }
=======

        val result = List(loop - 1) { it }
            .fold(Car()) { acc, _ -> acc.go()}
            .toString()
        val expected = "-".repeat(loop)

        assertThat(result).isEqualTo(expected)
    }
>>>>>>> ef70116 (refactor: test package 구성 변경 및 Car model test 추가)
}