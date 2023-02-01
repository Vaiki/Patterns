package strategy

import javax.print.attribute.standard.JobMessageFromOperator

object Navigator {
    private lateinit var strategy: Strategy
    private var from: Double = 0.0
    private var to: Double = 0.0

    fun userUI(from: Double, to: Double, howToGetThere: String) {
        enteringPoints(from, to)
        when (howToGetThere) {
            "Walking" -> setWayGetTo(Walking())
            "Public Transport" -> setWayGetTo(PublicTransport())
            "My Car" -> setWayGetTo(MyCar())
            else -> throw RuntimeException("you entered a non-existent way")
        }
        println("You choose $howToGetThere")
        println("Follow the given route: ${buildRoute().joinToString(" -> ")}\n")
    }

    private fun enteringPoints(from: Double, to: Double) {
        this.from = from
        this.to = to
    }

    private fun setWayGetTo(strategy: Strategy) {
        this.strategy = strategy
    }

    private fun buildRoute(): List<Double> = strategy.execute(from, to)
}