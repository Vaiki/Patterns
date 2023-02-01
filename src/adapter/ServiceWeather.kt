package adapter

import java.text.Format

class ServiceWeather(private val temp: Map<City, SensorC>) {

   fun presentationForUser(){
        temp.forEach { (t, u) -> println("In ${t.name} - ${u.getResult().toInt()} C\u00B0") }
    }


}
