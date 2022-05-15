package racing.model

data class Car(val position: String = CAR_PROGRESS_CHAR) {

    companion object {
        private const val CAR_PROGRESS_CHAR = "-"
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6103f50 (refactor: 함수에서 랜덤값을 파라미터로 받게 함)
        private const val GO_THRESHOLD_VALUE = 4
    }

    fun goOrNot(randomNumber: Int): Car {
        return if (randomNumber >= GO_THRESHOLD_VALUE) {
            go()
        } else {
            this
        }
<<<<<<< HEAD
=======
>>>>>>> 1a814e9 (refactor: package 구성 변경)
=======
>>>>>>> 6103f50 (refactor: 함수에서 랜덤값을 파라미터로 받게 함)
    }

    fun go() : Car {
        return Car("$position$CAR_PROGRESS_CHAR")
    }

    override fun toString(): String {
        return position
    }
}
