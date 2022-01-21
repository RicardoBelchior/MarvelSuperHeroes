package com.rbelchior.marvel.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rbelchior.marvel.domain.Character
import java.time.ZonedDateTime

@Entity
data class CharacterEntity(
    @PrimaryKey val id: Long,
    val name: String,
    val description: String,
    val modified: ZonedDateTime?,
    val thumbnailUrl: String,

    val comicsAvailable: Int,
    val seriesAvailable: Int,
    val storiesAvailable: Int,
    val eventsAvailable: Int,

    val urls: Character.Urls,

    val createdAt: Long = System.currentTimeMillis(),
)
