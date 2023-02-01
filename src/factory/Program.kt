package factory

import factory.Program.Companion.createDeveloper

class Program {
    companion object {
        fun createDeveloper(specialty: Developers): DeveloperFactory {
            return when (specialty.name) {
                "ANDROID" -> AndroidDeveloperFactory()
                "SWIFT" -> IOSDeveloperFactory()
                "KMM" -> MultiPlatformDeveloperFactory()
                else -> throw RuntimeException("$specialty is unknown specialty.")
            }
        }
    }
}

fun main() {

    val developerFactory: DeveloperFactory = createDeveloper(Developers.ANDROID)
    val developer = developerFactory.createDeveloper()

    developer.writeCode()


}


