package cl.plaplix.testcaseproductos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cl.plaplix.testcaseproductos.model.Repository

class MainActivity : AppCompatActivity() {

    val tag = "MainActivity"

    private var repository = Repository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        repository.loadApiData()
    }
}