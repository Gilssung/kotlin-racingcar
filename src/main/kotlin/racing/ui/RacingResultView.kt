package racing.ui

<<<<<<< HEAD
<<<<<<< HEAD
import racing.model.Round

class RacingResultView(
    private val tries: Int,
    private val eachRoundMap: Map<Int, Round>
=======
import racing.model.Car

class RacingResultView(
    private val tries: Int,
    private val eachRoundMap: Map<Int, List<Car>>
>>>>>>> 1a814e9 (refactor: package 구성 변경)
=======
import racing.model.Round

class RacingResultView(
    private val tries: Int,
    private val eachRoundMap: Map<Int, Round>
>>>>>>> aec1086 (refactor: eachRoundMap 제거)
) {

    fun display() {
        println("실행 결과")
        repeat(tries) { displayRound(it) }
    }

    private fun displayRound(roundNo: Int) {
<<<<<<< HEAD
<<<<<<< HEAD
        eachRoundMap[roundNo]?.cars?.forEach { println(it) }
=======
        eachRoundMap[roundNo]!!.forEach { println(it) }
>>>>>>> 1a814e9 (refactor: package 구성 변경)
=======
        eachRoundMap[roundNo]?.cars?.forEach { println(it) }
>>>>>>> aec1086 (refactor: eachRoundMap 제거)
        println()
    }
}
