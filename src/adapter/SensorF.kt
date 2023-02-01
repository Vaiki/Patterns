package adapter

class SensorF(private val f: Double):Temperature {

    override fun getResult(): Double {
        return f
    }

}