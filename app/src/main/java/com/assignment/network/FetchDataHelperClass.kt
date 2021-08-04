package com.assignment.network

import DataFromServer
import android.util.Log
import com.example.codegamaassignment.ApiUtil
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FetchDataHelperClass : FetchUiData {

    override fun fetchCustomUI(url: String,callback:ResponceCallback) {
       var jsonObject: JsonObject?

       val apiService = ApiUtil.getUi()

       val call = apiService.getUiData("android_assignment.json")

       call.enqueue(object : Callback<JsonObject> {
           override fun onResponse(
               call: Call<JsonObject>,
               response: Response<JsonObject>
           ) {
               jsonObject = response.body()!!
               callback.onSuccess(Result.success(jsonObject) as Result<JsonObject>)

           }

           override fun onFailure(call: Call<JsonObject>, t: Throwable) {
               jsonObject = null
           }

       })

   }

    override fun fetchImageData(url: String,callback: ResponceCallback){
        var imageUrl: String?
        val apiService = ApiUtil.getUi()

        val call = apiService.getImageData("android_assignment.json")

        call.enqueue(object : Callback<DataFromServer> {
            override fun onResponse(
                call: Call<DataFromServer>,
                response: Response<DataFromServer>
            ) {
                imageUrl = response.body()?.logourl!!
                callback.onImageSuccess(Result.success(imageUrl) as Result<String>)
            }

            override fun onFailure(call: Call<DataFromServer>, t: Throwable) {
                imageUrl = null
            }

        })
    }
}