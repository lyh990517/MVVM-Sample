package yunho.app.mvvm_sample.DataSource.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import yunho.app.mvvm_sample.DataSource.Entity.Entity

@Dao
interface DAO {
    @Query("SELECT * FROM entity_table")
    fun getAll() : LiveData<List<Entity>>

    @Insert
    fun insert(entity: Entity)

    @Delete
    fun delete(entity: Entity)
}