package com.rbelchior.marvel.di

import android.content.Context
import androidx.room.Room
import com.rbelchior.marvel.data.local.SuperHeroesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@Suppress("unused")
@InstallIn(SingletonComponent::class)
object DatabaseDaggerModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): SuperHeroesDatabase {
        return Room
            .databaseBuilder(context, SuperHeroesDatabase::class.java, "superheroes-db")
            .build()
    }

}
