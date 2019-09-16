package nl.jordanvanbeijnhem.numberskotlin.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import nl.jordanvanbeijnhem.numberskotlin.model.Trivia
import nl.jordanvanbeijnhem.numberskotlin.repository.NumbersRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val numbersRepository = NumbersRepository()
    val trivia = MutableLiveData<Trivia>()
    val error = MutableLiveData<String>()

    fun getRandomTrivia() {
        numbersRepository.getRandomNumberTrivia().enqueue(object : Callback<Trivia> {
            override fun onResponse(call: Call<Trivia>, response: Response<Trivia>) {
                if (response.isSuccessful) trivia.value = response.body()
                else error.value = "An error occurred: ${response.errorBody().toString()}"
            }

            override fun onFailure(call: Call<Trivia>, t: Throwable) {
                error.value = t.message
            }
        })
    }

}