package yunho.app.mvvm_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import yunho.app.mvvm_sample.ViewModel.ViewModel
import yunho.app.mvvm_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewModel : ViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}