package adapter

class SensorC(private val c: Double):Temperature {
   override fun getResult(): Double {
        return c
    }
}