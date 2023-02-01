package factory

class AndroidDeveloperFactory : DeveloperFactory {
    override fun createDeveloper(): Developer {
        return AndroidDeveloper()
    }
}