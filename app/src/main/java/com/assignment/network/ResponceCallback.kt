package com.assignment.network

import DataFromServer
import com.google.gson.JsonObject

interface ResponceCallback {

    fun onSuccess(value: Result<JsonObject>)
    fun onImageSuccess(value : Result<String>)
    fun onFailure()
}