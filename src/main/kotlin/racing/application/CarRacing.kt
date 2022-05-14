package racing.application

import racing.model.Car
<<<<<<< HEAD
import racing.model.Round
=======
>>>>>>> 1a814e9 (refactor: package 구성 변경)

class CarRacing(private val numberOfCars: Int, private val tries: Int) {

    companion object {
<<<<<<< HEAD
        private const val RANDOM_VALUE_FROM = 0
        private const val RANDOM_VALUE_UNTIL = 9

        fun getRandom(take: Int): List<Int> {
            return List(take) {
                (RANDOM_VALUE_FROM..RANDOM_VALUE_UNTIL).random()
            }
        }
    }

    fun start(): Map<Int, Round> {
        val roundsMap = mutableMapOf<Int, Round>()
        repeat(tries) {
            val prevRound = roundsMap[it - 1]
            roundsMap[it] = getNextRound(prevRound, getRandom(numberOfCars), numberOfCars)
        }
        return roundsMap
    }

    private fun getNextRound(prevRound: Round?, randomNumbers: List<Int>, numberOfCars: Int): Round =
        prevRound?.next(randomNumbers) ?: getFirstRound(numberOfCars)

    private fun getFirstRound(numberOfCars: Int): Round =
        Round(List(numberOfCars) { Car() })
=======
        const val RANDOM_VALUE_FROM = 0
        const val RANDOM_VALUE_UNTIL = 9
        const val GO_THRESHOLD_VALUE = 4

        fun willGo(): Boolean =
            GO_THRESHOLD_VALUE <= getRandom()

        fun getRandom(): Int =
            (RANDOM_VALUE_FROM..RANDOM_VALUE_UNTIL).random()
    }

    val eachRoundMap = mutableMapOf<Int, List<Car>>()

    fun start() {
        repeat(tries) { round(it) }
    }

    fun round(roundNo: Int) {
        if(eachRoundMap[roundNo - 1].isNullOrEmpty()) {
            eachRoundMap[roundNo] = List(numberOfCars) { Car() }
        } else {
            eachRoundMap.computeIfAbsent(roundNo) {
                eachRoundMap[roundNo - 1]!!.map {car ->
                    if(willGo()) car.go()
                    else car
                }
            }
        }
    }
>>>>>>> 1a814e9 (refactor: package 구성 변경)
}