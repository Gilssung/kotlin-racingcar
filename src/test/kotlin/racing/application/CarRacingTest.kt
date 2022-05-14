package racing.application

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import racing.model.Car
<<<<<<< HEAD
import racing.model.Round
=======
>>>>>>> ef70116 (refactor: test package 구성 변경 및 Car model test 추가)

internal class CarRacingTest {

    @Test
    fun `get random value between 0 - 9`() {
        repeat(100) {
<<<<<<< HEAD
            //given
            val numberOfRandomInt = it + 1
            val randomValueFrom = 0
            val randomValueTo = 9

            //when
            val result = CarRacing
                .getRandom(numberOfRandomInt)
                .first()

            //then
            assertThat(result)
                .isGreaterThanOrEqualTo(randomValueFrom)
                .isLessThanOrEqualTo(randomValueTo)
=======
            assertThat(CarRacing.getRandom())
                .isGreaterThanOrEqualTo(0)
                .isLessThanOrEqualTo(9)
>>>>>>> ef70116 (refactor: test package 구성 변경 및 Car model test 추가)
        }
    }

    @Test
    fun `first round do initialization test`() {
<<<<<<< HEAD
        //given
        val firstRoundNo = 0
        val numberOfCars = 3
        val tries = 3
        val carRacing = CarRacing(numberOfCars, tries)
        val expected = List(numberOfCars) { Car() }

        //when
        val result = carRacing.start()

        //then
        assertThat(result[firstRoundNo])
            .extracting("cars")
=======
        val carRacing = CarRacing(3, 3)
        assertThat(carRacing.eachRoundMap)
            .isEmpty()

        carRacing.round(1)
        val expected = List(3) { Car() }

        assertThat(carRacing.eachRoundMap[1])
>>>>>>> ef70116 (refactor: test package 구성 변경 및 Car model test 추가)
            .isEqualTo(expected)
    }

    @ParameterizedTest
    @CsvSource(
        "3, 3",
        "10, 20",
        "23, 15",
        "1231, 1"
    )
<<<<<<< HEAD
    fun `start method create round result`(numberOfCars: Int, tries: Int) {
        //given
        val expectedKeys = Array(tries) { it }
        val expectedValue = Round(List(numberOfCars) { Car() })

        //when
        val racingResult = CarRacing(numberOfCars, tries).start()

        //then
        assertThat(racingResult)
=======
    fun `start method create each round result`(numberOfCars: Int, tries: Int) {
        val carRacing = CarRacing(numberOfCars, tries)
        carRacing.start()

        val expectedKeys = Array(tries) { it }
        val expectedValue = List(numberOfCars) { Car() }
        assertThat(carRacing.eachRoundMap)
>>>>>>> ef70116 (refactor: test package 구성 변경 및 Car model test 추가)
            .containsKeys(*expectedKeys)
            .containsEntry(0, expectedValue)
    }
}
