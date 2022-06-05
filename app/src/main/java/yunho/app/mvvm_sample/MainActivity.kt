package yunho.app.mvvm_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import kotlinx.coroutines.*
import yunho.app.mvvm_sample.DataSource.Entity.Entity
import yunho.app.mvvm_sample.ViewModel.ViewModel
import yunho.app.mvvm_sample.databinding.ActivityMainBinding
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(),CoroutineScope{
    private val viewModel : ViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        launch(coroutineContext) {
            withContext(Dispatchers.IO) {
                viewModel.repository.insert(Entity(null, "lyh"))
            }
            Log.e("1", "${viewModel.repository.getAll()}")
        }
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + Job()
}