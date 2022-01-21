package com.rbelchior.marvel.data.local.converter

import androidx.room.TypeConverter
import com.rbelchior.marvel.domain.Character
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi

object CharacterUrlsConverter {

    private val moshi = Moshi.Builder().build();
    private val jsonAdapter: JsonAdapter<Character.Urls> by lazy {
        moshi.adapter(Character.Urls::class.java)
    }

    @TypeConverter
    fun fromItemsList(urls: Character.Urls?): String? {
        return jsonAdapter.toJson(urls)
    }


    @TypeConverter
    fun toItemsList(stringValue: String?): Character.Urls? {
        return stringValue?.let { jsonAdapter.fromJson(stringValue) }
    }

}
