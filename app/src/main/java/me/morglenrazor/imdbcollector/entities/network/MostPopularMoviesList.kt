package me.morglenrazor.imdbcollector.entities.network

data class MostPopularMoviesList(
    val errorMessage: String,
    val items: List<InfoMPMList>
)