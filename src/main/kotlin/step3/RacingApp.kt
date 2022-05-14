package step3

object RacingApp {
    fun launch() {
        val numberOfCars = RacingInputView.getNumberOfCars()
        val tries = RacingInputView.getTries()
        val racing = CarRacing(numberOfCars, tries)

        racing.start()
        val resultView = RacingResultView(tries, racing.eachRoundMap)

        resultView.display()
    }
}

fun main() {
    RacingApp.launch()
}
