package me.morglenrazor.imdbcollector.model.mostpopular

import me.morglenrazor.imdbcollector.entities.network.InfoMPMList
import retrofit2.Call
import retrofit2.http.GET

interface IMDBApi {
    
    @GET("/MostPopularMovies/k_6ngv2e1e")
    suspend fun getMostPopularMovies() : List<InfoMPMList>
}