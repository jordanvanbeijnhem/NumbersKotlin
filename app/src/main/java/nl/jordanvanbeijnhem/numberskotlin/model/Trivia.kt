package nl.jordanvanbeijnhem.numberskotlin.model

import com.google.gson.annotations.SerializedName

data class Trivia(
    @SerializedName("text") var text: String,
    @SerializedName("number") var number: Long,
    @SerializedName("found") var found: Boolean,
    @SerializedName("type") var type: String
)
