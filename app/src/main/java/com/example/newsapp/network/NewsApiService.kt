package com.example.newsapp.network

import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {


    @GET("v2/top-headlines")
    suspend fun getNews(
        @Query("country")
        cnCode: String,
        @Query("category")
        category: String = "",
        @Query("page")
        pgNo: Int = 1,
        @Query("apiKey")
        apikey: String = "f589891bfdc14ce29037bde3d60cdcdb"
    ): NewsResponse

    @GET("v2/everything")
    suspend fun getAll(
        @Query("q")
        search: String,
        @Query("page")
        pgNo: Int = 1,
        @Query("apiKey")
        apikey: String = "f589891bfdc14ce29037bde3d60cdcdb"
    ): NewsResponse
}