package com.rbelchior.marvel.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import com.rbelchior.marvel.data.local.entity.CharacterEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao : BaseDao<CharacterEntity> {

    /**
     * Get all data from the Data table.
     */
    @Query("SELECT * FROM CharacterEntity")
    fun getAll(): Flow<List<CharacterEntity>>

    @Query("SELECT * FROM CharacterEntity WHERE name LIKE :searchQuery || '%' ORDER BY name")
    fun getPages(searchQuery: String): PagingSource<Int, CharacterEntity>

    @Query("SELECT * FROM CharacterEntity WHERE id = :id")
    fun getById(id: Long): Flow<CharacterEntity>

    @Query("DELETE FROM CharacterEntity")
    fun deleteAll()

}
