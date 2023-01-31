package adapter

interface Database {
    fun insert()
    fun update(id:Int)
    fun select()
    fun delete(id:Int)

}