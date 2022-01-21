package com.rbelchior.marvel.data.local.converter

import androidx.room.TypeConverter
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

object DateConverter {
    internal val dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssxxxx")

    @TypeConverter
    fun fromString(value: String?): ZonedDateTime? {
        return value?.let {
            ZonedDateTime.parse(value, dateFormatter)
        }
    }

    @TypeConverter
    fun dateToString(date: ZonedDateTime?): String? {
        return date?.format(dateFormatter)
    }

}
