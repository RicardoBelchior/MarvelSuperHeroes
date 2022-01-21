package com.rbelchior.marvel.data.local.converter

import androidx.room.TypeConverter
import com.rbelchior.marvel.domain.Item
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types.newParameterizedType

object ItemsListConverter {

    private val moshi = Moshi.Builder().build();
    private val jsonAdapter: JsonAdapter<List<Item>> by lazy {
        val tagsListType = newParameterizedType(List::class.java, Item::class.java)
        moshi.adapter(tagsListType)
    }

    @TypeConverter
    fun fromItemsList(items: List<Item>?): String? {
        return items?.let { jsonAdapter.toJson(it) }
    }

    @TypeConverter
    fun toItemsList(stringValue: String?): List<Item>? {
        return stringValue?.let { jsonAdapter.fromJson(stringValue) }
    }

}
