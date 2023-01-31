package strategy

import kotlin.random.Random

class PublicTransport:Strategy {
    override fun execute(from: Double, to: Double):List<Double> {
        val listPoints = mutableListOf<Double>()
        listPoints.add(from)
        repeat(3) {
            listPoints.add(Random.nextDouble(from, to))
        }
        listPoints.add(to)
        return listPoints
    }
}