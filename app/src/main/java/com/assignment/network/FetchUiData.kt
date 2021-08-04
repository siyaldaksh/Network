package com.assignment.network

import com.google.gson.JsonObject
import org.json.JSONObject

interface FetchUiData {

    fun fetchCustomUI(url:String,callback: ResponceCallback)

    fun fetchImageData(url : String,callback: ResponceCallback)
}