package com.rbelchior.marvel.data.local

import com.rbelchior.marvel.data.local.entity.CharacterEntity
import com.rbelchior.marvel.domain.Character

object Mapper {

    fun CharacterEntity.toModel(): Character {
        return Character(
            id,
            name, description,
            modified, thumbnailUrl,
            comicsAvailable, seriesAvailable, storiesAvailable, eventsAvailable,
            urls
        )
    }

    fun Character.toEntity(): CharacterEntity {
        return CharacterEntity(
            id,
            name, description,
            modified, thumbnailUrl,
            comicsAvailable, seriesAvailable, storiesAvailable, eventsAvailable,
            urls
        )
    }
}
