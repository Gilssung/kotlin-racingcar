package step3

fun main() {
    val (carCount, raceCount) = InputView.handleInput()

    val cars = Car.makeCars(carCount)
    val racingGame = RacingGame(cars, RandomRule())

    val results = racingGame.play(raceCount)

    OutputView.handleOutput(raceCount, results)
}