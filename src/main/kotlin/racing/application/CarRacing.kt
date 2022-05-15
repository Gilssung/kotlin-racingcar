package racing.application

import racing.model.Car
<<<<<<< HEAD
<<<<<<< HEAD
import racing.model.Round
=======
>>>>>>> 1a814e9 (refactor: package 구성 변경)
=======
import racing.model.Round
>>>>>>> aec1086 (refactor: eachRoundMap 제거)

class CarRacing(private val numberOfCars: Int, private val tries: Int) {

    companion object {
<<<<<<< HEAD
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

<<<<<<< HEAD
    private fun getNextRound(prevRound: Round?, randomNumbers: List<Int>, numberOfCars: Int): Round =
        prevRound?.next(randomNumbers) ?: getFirstRound(numberOfCars)

    private fun getFirstRound(numberOfCars: Int): Round =
        Round(List(numberOfCars) { Car() })
=======
        const val RANDOM_VALUE_FROM = 0
        const val RANDOM_VALUE_UNTIL = 9
        const val GO_THRESHOLD_VALUE = 4
=======
        private const val RANDOM_VALUE_FROM = 0
        private const val RANDOM_VALUE_UNTIL = 9
>>>>>>> aec1086 (refactor: eachRoundMap 제거)

        fun getRandom(take: Int): List<Int> {
            return List(take) {
                (RANDOM_VALUE_FROM..RANDOM_VALUE_UNTIL).random()
            }
        }
    }
<<<<<<< HEAD
>>>>>>> 1a814e9 (refactor: package 구성 변경)
=======

    fun start(): Map<Int, Round> {
        val roundsMap = mutableMapOf<Int, Round>()
        repeat(tries) {
            val prevRound = roundsMap[it - 1]
            roundsMap[it] = getNextRound(prevRound, getRandom(numberOfCars), numberOfCars)
        }
        return roundsMap
    }

    private fun getFirstRound(numberOfCars: Int): Round =
        Round(List(numberOfCars) { Car() })

    private fun getNextRound(prevRound: Round?, randomNumbers: List<Int>, numberOfCars: Int): Round =
        prevRound?.next(randomNumbers) ?: getFirstRound(numberOfCars)
>>>>>>> aec1086 (refactor: eachRoundMap 제거)
=======
    private fun getNextRound(prevRound: Round?, randomNumbers: List<Int>, numberOfCars: Int): Round =
        prevRound?.next(randomNumbers) ?: getFirstRound(numberOfCars)

    private fun getFirstRound(numberOfCars: Int): Round =
        Round(List(numberOfCars) { Car() })
>>>>>>> 6103f50 (refactor: 함수에서 랜덤값을 파라미터로 받게 함)
}