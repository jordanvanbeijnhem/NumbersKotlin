package nl.jordanvanbeijnhem.numberskotlin.api

import nl.jordanvanbeijnhem.numberskotlin.model.Trivia
import retrofit2.Call
import retrofit2.http.GET

interface NumbersApiService {

    @GET("/random/trivia?json")
    fun getRandomNumberTrivia(): Call<Trivia>
}