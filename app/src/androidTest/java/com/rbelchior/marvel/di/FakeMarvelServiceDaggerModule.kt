package com.rbelchior.marvel.di

import com.rbelchior.marvel.data.remote.MarvelService
import com.rbelchior.marvel.data.remote.model.CharactersDto
import com.rbelchior.marvel.data.remote.model.ComicsDto
import com.rbelchior.marvel.util.mother.CharactersDtoMother
import com.rbelchior.marvel.util.mother.ComicsDtoMother
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import io.mockk.coEvery
import io.mockk.mockk
import javax.inject.Singleton


@Module
@Suppress("unused")
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [MarvelServiceDaggerModule::class]
)
object FakeMarvelServiceDaggerModule {
    private const val CACHE_SIZE = 10 * 1024 * 1024L // 10mb


    @Singleton
    @Provides
    fun provideMarvelService(moshi: Moshi): MarvelService {
        val fakeCharacters = moshi
            .adapter(CharactersDto::class.java)
            .fromJson(CharactersDtoMother.sampleResponse)!!

        val fakeComics = moshi
            .adapter(ComicsDto::class.java)
            .fromJson(ComicsDtoMother.comicsListSampleResponse)!!

        return mockk {
            coEvery { getCharacters(any(), any(), any(), any()) } returns fakeCharacters
            coEvery { getCharacterComics(any(), any(), any()) } returns fakeComics
        }
    }

}
