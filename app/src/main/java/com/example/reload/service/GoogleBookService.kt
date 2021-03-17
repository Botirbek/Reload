package com.example.reload.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class GoogleBookService {
    private var retrofit: Retrofit? = null
    private val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"
    val retrofitInstance: Retrofit?
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}