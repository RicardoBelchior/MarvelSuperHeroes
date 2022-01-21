package com.rbelchior.marvel.data.remote.model

data class ComicsDto(
    val code: Int? = null,
    val status: String? = null,
    val copyright: String? = null,
    val attributionText: String? = null,
    val attributionHTML: String? = null,
    val etag: String? = null,
    val data: Data? = Data()
) {

    data class Data(
        val offset: Int? = null,
        val limit: Int? = null,
        val total: Int? = null,
        val count: Int? = null,
        val results: List<Results> = emptyList()
    ) {
        data class Results(
            val id: Long? = null,
            val digitalId: Int? = null,
            val title: String? = null,
            val issueNumber: Double? = null,
            val variantDescription: String? = null,
            val description: String? = null,
            val modified: String? = null,
            val isbn: String? = null,
            val upc: String? = null,
            val diamondCode: String? = null,
            val ean: String? = null,
            val issn: String? = null,
            val format: String? = null,
            val pageCount: Int? = null,
            val textObjects: List<TextObjects> = emptyList(),
            val resourceURI: String? = null,
            val urls: List<Urls> = emptyList(),
            val series: Series? = Series(),
            val variants: List<Item> = emptyList(),
            val collections: List<Collections> = emptyList(),
            val dates: List<Dates> = emptyList(),
            val prices: List<Prices> = emptyList(),
            val thumbnail: Thumbnail? = Thumbnail(),
            val images: List<Images> = emptyList(),
            val creators: Creators? = Creators(),
            val characters: Characters? = Characters(),
            val stories: Stories? = Stories(),
            val events: Events? = Events()
        )

        data class Events(
            val available: Int? = null,
            val collectionURI: String? = null,
            val items: List<Item> = emptyList(),
            val returned: Int? = null
        )

        data class Stories(
            val available: Int? = null,
            val collectionURI: String? = null,
            val items: List<Item> = emptyList(),
            val returned: Int? = null
        )

        data class Characters(
            val available: Int? = null,
            val collectionURI: String? = null,
            val items: List<Item> = emptyList(),
            val returned: Int? = null
        )

        data class Creators(
            val available: Int? = null,
            val collectionURI: String? = null,
            val items: List<Item> = emptyList(),
            val returned: Int? = null
        )

        data class Images(
            val path: String? = null,
            val extension: String? = null
        )

        data class Thumbnail(
            val path: String? = null,
            val extension: String? = null
        )

        data class Prices(
            val type: String? = null,
            val price: Double? = null
        )

        data class Dates(
            val type: String? = null,
            val date: String? = null
        )

        data class Collections(
            val resourceURI: String? = null,
            val name: String? = null
        )

        data class Series(
            val resourceURI: String? = null,
            val name: String? = null
        )

        data class Urls(
            val type: String? = null,
            val url: String? = null
        )

        data class TextObjects(
            val type: String? = null,
            val language: String? = null,
            val text: String? = null
        )

        data class Item(
            val resourceURI: String? = null,
            val name: String? = null,
            val role: String? = null
        )

    }
}