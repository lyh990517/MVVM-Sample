package yunho.app.mvvm_sample.Repository

import androidx.lifecycle.LiveData
import yunho.app.mvvm_sample.DataSource.Database.Database
import yunho.app.mvvm_sample.DataSource.Entity.Entity

class Repository(Database : Database) {

    private val dao = Database.dao()

    suspend fun insert(entity: Entity){
        dao.insert(entity)
    }

    suspend fun delete(entity: Entity){
        dao.insert(entity)
    }

    fun getAll(): LiveData<List<Entity>> = dao.getAll()
}