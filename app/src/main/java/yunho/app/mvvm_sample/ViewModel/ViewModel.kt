package yunho.app.mvvm_sample.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import yunho.app.mvvm_sample.DataSource.Database.Database
import yunho.app.mvvm_sample.DataSource.Entity.Entity
import yunho.app.mvvm_sample.Repository.Repository

class ViewModel(application: Application): AndroidViewModel(application) {
    val repository: Repository = Repository(Database.getDatabase(application.applicationContext,viewModelScope))

    fun insert(entity: Entity) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(entity)
    }

    fun delete(entity: Entity) = viewModelScope.launch(Dispatchers.IO){
        repository.delete(entity)
    }

    fun getAll(): LiveData<List<Entity>> = repository.getAll()
}