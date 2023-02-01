package factory

class IOSDeveloperFactory:DeveloperFactory {
    override fun createDeveloper(): Developer {
        return IOSDeveloper()
    }
}