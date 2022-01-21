package com.rbelchior.marvel.di

import com.rbelchior.marvel.data.remote.MarvelService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@Suppress("unused")
@InstallIn(SingletonComponent::class)
object MarvelServiceDaggerModule {
    private const val CACHE_SIZE = 10 * 1024 * 1024L // 10mb

    @Singleton
    @Provides
    fun provideMarvelService(retrofit: Retrofit): MarvelService {
        return retrofit.create(MarvelService::class.java)
    }

}
