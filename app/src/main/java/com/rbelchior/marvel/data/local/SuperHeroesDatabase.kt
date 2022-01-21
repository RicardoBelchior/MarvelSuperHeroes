package com.rbelchior.marvel.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rbelchior.marvel.data.local.converter.CharacterUrlsConverter
import com.rbelchior.marvel.data.local.converter.DateConverter
import com.rbelchior.marvel.data.local.converter.ItemsListConverter
import com.rbelchior.marvel.data.local.dao.CharacterDao
import com.rbelchior.marvel.data.local.dao.RemoteKeyDao
import com.rbelchior.marvel.data.local.entity.CharacterEntity
import com.rbelchior.marvel.data.local.entity.RemoteKeyEntity

@Database(
    version = 1,
    entities = [
        CharacterEntity::class,
        RemoteKeyEntity::class
    ],
    exportSchema = true,
)
@TypeConverters(
    DateConverter::class, ItemsListConverter::class, CharacterUrlsConverter::class
)
abstract class SuperHeroesDatabase : RoomDatabase() {
    abstract fun characterDao(): CharacterDao
    abstract fun remoteKeyDao(): RemoteKeyDao
}


