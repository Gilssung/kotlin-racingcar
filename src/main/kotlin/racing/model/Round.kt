package racing.model

data class Round(val cars: List<Car>) {
<<<<<<< HEAD
=======
    companion object {
        const val GO_THRESHOLD_VALUE = 4
    }
>>>>>>> aec1086 (refactor: eachRoundMap 제거)

    fun next(randomNumbers: List<Int>): Round {
        return Round(
            cars.mapIndexed { idx, car ->
<<<<<<< HEAD
                car.goOrNot(randomNumbers[idx])
=======
                if (randomNumbers[idx] >= GO_THRESHOLD_VALUE) {
                    car.go()
                } else {
                    car
                }
>>>>>>> aec1086 (refactor: eachRoundMap 제거)
            }
        )
    }
}