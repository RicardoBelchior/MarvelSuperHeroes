package com.rbelchior.marvel.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rbelchior.marvel.data.local.entity.RemoteKeyEntity

@Dao
interface RemoteKeyDao {
  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun insertOrReplace(remoteKeyEntity: RemoteKeyEntity)

  @Query("SELECT * FROM remote_keys WHERE label = :query")
  suspend fun remoteKeyByQuery(query: String): RemoteKeyEntity

  @Query("DELETE FROM remote_keys WHERE label = :query")
  suspend fun deleteByQuery(query: String)
}
