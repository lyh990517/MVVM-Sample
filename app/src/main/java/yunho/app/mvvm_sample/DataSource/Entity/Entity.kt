package yunho.app.mvvm_sample.DataSource.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "entity_table")
data class Entity(
    @PrimaryKey
    val id: Int,
    var name: String
)