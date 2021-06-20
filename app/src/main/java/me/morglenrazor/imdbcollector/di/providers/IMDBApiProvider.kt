package me.morglenrazor.imdbcollector.di.providers

import com.google.gson.Gson
import me.morglenrazor.imdbcollector.model.mostpopular.IMDBApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class IMDBApiProvider(private val okHttpClient: OkHttpClient, private val gson: Gson) {

    fun get() : IMDBApi =
        Retrofit.Builder()
            .baseUrl("https://imdb-api.com/en/API/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(IMDBApi::class.java)
}