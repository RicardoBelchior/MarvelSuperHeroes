package com.rbelchior.marvel.di

import com.rbelchior.marvel.data.CharactersRepository
import com.rbelchior.marvel.data.ComicsRepository
import com.rbelchior.marvel.data.local.SuperHeroesDatabase
import com.rbelchior.marvel.data.remote.MarvelService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import javax.inject.Singleton

@Module
@Suppress("unused")
@InstallIn(SingletonComponent::class)
class RepositoryDaggerModule {

    @Singleton
    @Provides
    fun provideCharactersRepository(
        superHeroesDatabase: SuperHeroesDatabase,
        marvelService: MarvelService,
        @IoDispatcher ioDispatcher: CoroutineDispatcher,
    ): CharactersRepository {
        return CharactersRepository(
            superHeroesDatabase, marvelService, ioDispatcher,
        )
    }

    @Singleton
    @Provides
    fun provideComicsRepository(
        marvelService: MarvelService,
        @DefaultDispatcher defaultDispatcher: CoroutineDispatcher,
    ): ComicsRepository {
        return ComicsRepository(
            marvelService,
            CoroutineScope(SupervisorJob() + defaultDispatcher)
        )
    }
}
