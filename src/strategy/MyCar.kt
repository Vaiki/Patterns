package strategy

import kotlin.random.Random

class MyCar : Strategy {
    override fun execute(from: Double, to: Double): List<Double> {
        val listPoints = mutableListOf<Double>()
        listPoints.add(from)
        repeat(4) {
            listPoints.add(Random.nextDouble(from, to))
        }
        listPoints.add(to)
        return listPoints
    }
}