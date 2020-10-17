package cl.plaplix.testcaseproductos.model

import android.util.Log
import cl.plaplix.testcaseproductos.model.remote.RetrofitClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Repository {

    val tag = "Repository"

    fun loadApiData() = CoroutineScope(Dispatchers.IO).launch {
        val response = RetrofitClient.retrofitInstance().productsList()

        when {
            response.isSuccessful -> response.body()?.map {
                Log.d(tag, "${it.id} - ${it.name} - ${it.price} - ${it.image}")
            }
            else -> Log.d(tag, response.errorBody().toString())
        }
    }
}