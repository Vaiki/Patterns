package builder

interface BuilderJuniorDeveloper {
    fun setDevelopmentEnvironment(developerKit:String)
    fun setLanguage(language:String)
    fun technologyStack(stack:List<String>)
    fun setMentor(name:String)

}