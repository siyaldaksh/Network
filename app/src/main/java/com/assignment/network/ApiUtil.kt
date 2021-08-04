package com.example.codegamaassignment

class ApiUtil() {

    companion object{
        private val BASE_URL = "https://demo.ezetap.com/mobileapps/"

        fun getUi(): Api {
            return RetrofitClient.getClient(BASE_URL).create(Api::class.java)
        }
    }


}