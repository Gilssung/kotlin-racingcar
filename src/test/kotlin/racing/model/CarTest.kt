package racing.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class CarTest {

    @Test
    fun `create default car`() {
<<<<<<< HEAD
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
=======
        //given
        val expected = "-"

        //when
        val result = Car().position

        //then
>>>>>>> 4af0d69 (test: 테스트 수정 및 추가)
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `toString test`() {
<<<<<<< HEAD
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
=======
        //given
        val expected = "-"

        //when
        val result = Car().toString()

        //then
>>>>>>> 4af0d69 (test: 테스트 수정 및 추가)
        assertThat(result).isEqualTo(expected)
    }

    @ParameterizedTest
    @ValueSource(ints = [1,2,3,4,5])
    fun `go test`(loop: Int) {
<<<<<<< HEAD
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
=======
        //given
        val expected = "-".repeat(loop)
>>>>>>> 4af0d69 (test: 테스트 수정 및 추가)

        //when
        val result = List(loop - 1) { it }
            .fold(Car()) { acc, _ -> acc.go()}
            .toString()

        //then
        assertThat(result).isEqualTo(expected)
    }
<<<<<<< HEAD
>>>>>>> ef70116 (refactor: test package 구성 변경 및 Car model test 추가)
=======

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
>>>>>>> 4af0d69 (test: 테스트 수정 및 추가)
}