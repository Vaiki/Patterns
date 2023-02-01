package factory

import factory.Program.Companion.createDeveloper

class Program {
    companion object {
        fun createDeveloper(specialty: String): DeveloperFactory {
            return when (specialty.lowercase()) {
                "android" -> AndroidDeveloperFactory()
                "swift" -> IOSDeveloperFactory()
                "kmm" -> MultiPlatformDeveloperFactory()
                else -> throw RuntimeException("$specialty is unknown specialty.")
            }
        }
    }

}

fun main() {

    val developerFactory: DeveloperFactory = createDeveloper("android")
    val developer = developerFactory.createDeveloper()

    developer.writeCode()


}


