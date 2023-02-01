package strategy

object Navigator {
    private lateinit var strategy: Strategy
    private var from: Double = 0.0
    private var to: Double = 0.0

    fun userUI(from: Double, to: Double, howToGetThere: TypeGetTo) {
        enteringPoints(from, to)
        when (howToGetThere) {
            TypeGetTo.WALKING -> setWayGetTo(Walking())
            TypeGetTo.PUBLIC_TRANSPORT -> setWayGetTo(PublicTransport())
            TypeGetTo.CAR -> setWayGetTo(MyCar())
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