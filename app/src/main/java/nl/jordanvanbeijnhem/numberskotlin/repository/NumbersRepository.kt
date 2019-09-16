package nl.jordanvanbeijnhem.numberskotlin.repository

import nl.jordanvanbeijnhem.numberskotlin.api.NumbersApi
import nl.jordanvanbeijnhem.numberskotlin.api.NumbersApiService

class NumbersRepository {

    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()
}
