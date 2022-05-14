package racing

import racing.application.CarRacing
import racing.ui.RacingInputView
import racing.ui.RacingResultView

object RacingApp {
    fun launch() {
        val numberOfCars = RacingInputView.getNumberOfCars()
        val tries = RacingInputView.getTries()
<<<<<<< HEAD
        val racingResult = CarRacing(numberOfCars, tries).start()

        val resultView = RacingResultView(tries, racingResult)
=======
        val racing = CarRacing(numberOfCars, tries)

        racing.start()
        val resultView = RacingResultView(tries, racing.eachRoundMap)
>>>>>>> 1a814e9 (refactor: package 구성 변경)

        resultView.display()
    }
}

fun main() {
    RacingApp.launch()
}
