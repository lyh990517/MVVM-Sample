package yunho.app.mvvm_sample.DataSource.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.CoroutineScope
import yunho.app.mvvm_sample.DataSource.DAO.DAO
import yunho.app.mvvm_sample.DataSource.Entity.Entity

@Database(entities = [Entity::class], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun dao() : DAO
    companion object{
        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): yunho.app.mvvm_sample.DataSource.Database.Database{
            return Room.databaseBuilder(
                context.applicationContext,
                yunho.app.mvvm_sample.DataSource.Database.Database::class.java,
                "database"
            ).build()
        }
    }
}