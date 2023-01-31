package factory

class MultiPlatformDeveloperFactory:DeveloperFactory {
    override fun createDeveloper(): Developer {
        return MultiPlatformDeveloper()
    }
}