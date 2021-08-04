package com.example.codegamaassignment

import DataFromServer
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url


interface Api {

    @GET()
    fun getUiData(@Url url:String): Call<JsonObject>

    @GET()
    fun getImageData(@Url url:String): Call<DataFromServer>

}