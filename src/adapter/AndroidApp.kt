package adapter

open class AndroidApp {
    fun saveObject() {
        println("Save input user data... ")
    }

    fun updateObject(id: Int) {
        println("Update choose object having id: $id")
    }

    fun loadingObject() {
        println("Loading data...")
    }

    fun deleteObject(id: Int) {
        println("Delete object having id: $id")
    }
}