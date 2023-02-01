package strategy

interface Strategy {
    fun execute(from: Double, to: Double):List<Double>
}