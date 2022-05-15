package racing.model

data class Round(val cars: List<Car>) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
    companion object {
        const val GO_THRESHOLD_VALUE = 4
    }
>>>>>>> aec1086 (refactor: eachRoundMap 제거)
=======
>>>>>>> 6103f50 (refactor: 함수에서 랜덤값을 파라미터로 받게 함)

    fun next(randomNumbers: List<Int>): Round {
        return Round(
            cars.mapIndexed { idx, car ->
<<<<<<< HEAD
<<<<<<< HEAD
                car.goOrNot(randomNumbers[idx])
=======
                if (randomNumbers[idx] >= GO_THRESHOLD_VALUE) {
                    car.go()
                } else {
                    car
                }
>>>>>>> aec1086 (refactor: eachRoundMap 제거)
=======
                car.goOrNot(randomNumbers[idx])
>>>>>>> 6103f50 (refactor: 함수에서 랜덤값을 파라미터로 받게 함)
            }
        )
    }
}