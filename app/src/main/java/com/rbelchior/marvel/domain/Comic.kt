package com.rbelchior.marvel.domain

import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class Comic(
    val id: Long,
    val title: String,
    val description: String,
    val published: LocalDate?,
    val creators: List<Creator>,

    val thumbnailUrl: String,
    val printPrice: Double?,
    val url: String,

    val series: Item?,
    val stories: List<Item>,
    val events: List<Item>,
    val characters: List<Item>,
) {

    data class Creator(
        val name: String,
        val role: String
    )

    fun getWriterName() =
        creators.firstOrNull { it.role == "writer" }?.name ?: "Mr. Shakespeare"

    fun getPrettyPublishedDate(): String =
        published?.format(DateTimeFormatter.ISO_LOCAL_DATE) ?: "N/A"
}

