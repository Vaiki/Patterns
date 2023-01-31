package adapter

class AdapterAndroidToDatabase:AndroidApp(),Database {
    override fun insert() {
        saveObject()
    }

    override fun update(id: Int) {
        updateObject(id)
    }

    override fun select() {
       loadingObject()
    }

    override fun delete(id: Int) {
       deleteObject(id)
    }
}