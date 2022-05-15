package racing.ui

<<<<<<< HEAD
<<<<<<< HEAD
object RacingInputView {

    fun getNumberOfCars(): Int {
        println("자동차 대수는 몇 대인가요?")
        return readln().toInt()
    }

    fun getTries(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return readln().toInt()
=======
class RacingInputView {
=======
object RacingInputView {
>>>>>>> 8173282 (refactor: 상태가 없는 RacingInputView object로 선언)

    fun getNumberOfCars(): Int {
        println("자동차 대수는 몇 대인가요?")
        return readln().toInt()
    }

<<<<<<< HEAD
        fun getTries(): Int {
            println("시도할 횟수는 몇 회인가요?")
            return readln().toInt()
        }
>>>>>>> 1a814e9 (refactor: package 구성 변경)
=======
    fun getTries(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return readln().toInt()
>>>>>>> 8173282 (refactor: 상태가 없는 RacingInputView object로 선언)
    }
}