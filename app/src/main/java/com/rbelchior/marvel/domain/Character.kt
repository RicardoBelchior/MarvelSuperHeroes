package com.rbelchior.marvel.domain

import java.time.ZonedDateTime

data class Character(
    val id: Long,
    val name: String,
    val description: String,
    val modified: ZonedDateTime?,
    val thumbnailUrl: String,

    val comicsAvailable: Int,
    val seriesAvailable: Int,
    val storiesAvailable: Int,
    val eventsAvailable: Int,

    val urls: Urls
) {
    data class Urls(
        val detail: String,
        val wiki: String,
        val comicLink: String,
    ) {

        fun getFirst(): String {
            return when {
                detail.isNotEmpty() -> detail
                wiki.isNotEmpty() -> wiki
                else -> comicLink
            }
        }
    }
}
