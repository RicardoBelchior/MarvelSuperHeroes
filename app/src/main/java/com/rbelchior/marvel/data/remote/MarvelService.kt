package com.rbelchior.marvel.data.remote

import com.rbelchior.marvel.data.remote.model.CharactersDto
import com.rbelchior.marvel.data.remote.model.ComicsDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MarvelService {

    @GET("characters")
    suspend fun getCharacters(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
        @Query("nameStartsWith") nameStartsWith: String? = null,
        @Query("orderBy") orderBy: String? = "name",
    ): CharactersDto

    @GET("characters/{id}/comics")
    suspend fun getCharacterComics(
        @Path("id") characterId: Long,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
    ): ComicsDto

}
