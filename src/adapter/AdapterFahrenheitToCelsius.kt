package adapter

class AdapterFahrenheitToCelsius() {


   operator fun invoke(sensorF:SensorF): SensorC {
        val result = (sensorF.getResult() - 32) / 1.8
        return SensorC(result)
    }
}