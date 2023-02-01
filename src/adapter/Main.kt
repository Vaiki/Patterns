package adapter

fun main() {

    val adapter = AdapterFahrenheitToCelsius()
    val tempSensorF: MutableMap<City, SensorF> = mutableMapOf()
    val tempSensorC: MutableMap<City, SensorC> = mutableMapOf()

    tempSensorF[City.MOGILEV] = SensorF(51.8)
    tempSensorF[City.GOMEL] = SensorF(55.4)

    tempSensorC[City.MINSK] = SensorC(10.6)
    tempSensorC[City.GRODNO] = SensorC(12.3)
    tempSensorC[City.VITEBSK] = SensorC(8.4)
    tempSensorC[City.BREST] = SensorC(14.8)

    tempSensorF.forEach { (t, u) -> tempSensorC[t] = adapter(u) }

    tempSensorC.toMap()

    printTempInCity(tempSensorC)

}

private fun printTempInCity(tempSensorC: MutableMap<City, SensorC>) {
    val serviceWeather = ServiceWeather(tempSensorC)
    serviceWeather.presentationForUser()
}