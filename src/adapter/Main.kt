package adapter

fun main(){
    val database:Database = AdapterAndroidToDatabase()
    database.apply {
        insert()
        update(12)
        select()
        delete(13)
    }
}