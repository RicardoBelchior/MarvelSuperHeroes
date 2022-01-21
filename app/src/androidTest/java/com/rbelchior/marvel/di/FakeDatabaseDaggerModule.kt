package com.rbelchior.marvel.di

import android.content.Context
import androidx.room.Room
import com.rbelchior.marvel.data.local.SuperHeroesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton


@Module
@Suppress("unused")
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [DatabaseDaggerModule::class]
)
object FakeDatabaseDaggerModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): SuperHeroesDatabase {
        return Room
            .inMemoryDatabaseBuilder(context, SuperHeroesDatabase::class.java)
            .build()
    }

}
