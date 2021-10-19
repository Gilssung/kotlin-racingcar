package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import racingcar.model.Car

class RacingCarTest {
    @Test
    @DisplayName("전진 테스트")
    fun `check move forward`() {
        val car = Car(name = "이름", movement = 0).forward()
        assertThat(car.movement).isEqualTo(1)
    }

    @Test
    @DisplayName("정지 테스트")
    fun `check move stop`() {
        val car = Car(name = "정지", movement = 0).stop()
        assertThat(car.movement).isEqualTo(0)
    }
}