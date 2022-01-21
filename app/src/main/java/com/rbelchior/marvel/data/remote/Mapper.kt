package com.rbelchior.marvel.data.remote

import androidx.annotation.VisibleForTesting
import com.rbelchior.marvel.data.remote.model.CharactersDto
import com.rbelchior.marvel.data.remote.model.ComicsDto
import com.rbelchior.marvel.domain.Character
import com.rbelchior.marvel.domain.Comic
import com.rbelchior.marvel.domain.Item
import logcat.LogPriority
import logcat.asLog
import logcat.logcat
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

object Mapper {

    fun CharactersDto.toModel(): List<Character> {
        return data?.results?.mapNotNull {
            try {
                it.toModel()
            } catch (e: Exception) {
                logcat(LogPriority.WARN) { e.asLog() }
                null
            }
        } ?: emptyList()
    }

    fun CharactersDto.Data.Result.toModel(): Character {

        return Character(
            id!!,
            name!!,
            description ?: "",
            parseDate(modified!!),
            thumbnail!!.path + "." + thumbnail.extension,
            comics?.available ?: 0,
            series?.available ?: 0,
            stories?.available ?: 0,
            events?.available ?: 0,
            Character.Urls(
                urls.find { it.type == "detail" }?.url ?: "",
                urls.find { it.type == "wiki" }?.url ?: "",
                urls.find { it.type == "comiclink" }?.url ?: "",
            )
        )
    }

    fun ComicsDto.toModel(): List<Comic> {
        return data?.results?.mapNotNull {
            try {
                it.toModel()
            } catch (e: Exception) {
                logcat(LogPriority.WARN) { e.asLog() }
                null
            }
        } ?: emptyList()
    }

    fun ComicsDto.Data.Results.toModel(): Comic {

        return Comic(
            id!!,
            title ?: "",
            description ?: "",
            parseDate(dates.first { it.type == "onsaleDate" }.date ?: "")?.toLocalDate(),
            creators?.items
                ?.map { Comic.Creator(it.name!!, it.role!!) }
                ?: emptyList(),
            thumbnail!!.path + "." + thumbnail.extension,
            prices.first { it.type == "printPrice" }.price,
            urls.find { it.type == "detail" }?.url ?: "",
            series?.let { Item(parseId(it.resourceURI!!), it.name!!) },
            stories?.items?.map { Item(parseId(it.resourceURI!!), it.name!!) } ?: emptyList(),
            events?.items?.map { Item(parseId(it.resourceURI!!), it.name!!) } ?: emptyList(),
            characters?.items?.map { Item(parseId(it.resourceURI!!), it.name!!) } ?: emptyList(),
        )
    }

    fun parseId(resourceUri: String): Long {
        return resourceUri.split("/").last().toLong()
    }

    @VisibleForTesting
    fun parseDate(date: String): ZonedDateTime? {
        return try {
            ZonedDateTime.parse(
                date,
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssxxxx")
            )
        } catch (e: DateTimeParseException) {
            logcat(LogPriority.WARN) { e.message ?: e.asLog() }
            null
        }

    }
}

