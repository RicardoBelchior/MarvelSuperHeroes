package com.rbelchior.marvel.data.remote.model

data class CharactersDto(
    val code: Int? = null,
    val status: String? = null,
    val copyright: String? = null,
    val attributionText: String? = null,
    val attributionHTML: String? = null,
    val etag: String? = null,
    val data: Data? = null
) {

    data class Data(
        val offset: Int? = null,
        val limit: Int? = null,
        val total: Int? = null,
        val count: Int? = null,
        val results: List<Result> = emptyList()
    ) {

        data class Result(
            val id: Long? = null,
            val name: String? = null,
            val description: String? = null,
            val modified: String? = null,
            val thumbnail: Thumbnail? = Thumbnail(),
            val resourceURI: String? = null,
            val comics: Comics? = Comics(),
            val series: Series? = Series(),
            val stories: Stories? = Stories(),
            val events: Events? = Events(),
            val urls: List<Urls> = emptyList()
        ) {

            data class Thumbnail(
                val path: String? = null,
                val extension: String? = null
            )

            data class Comics(
                val available: Int? = null,
                val collectionURI: String? = null,
                val items: List<Items> = emptyList(),
                val returned: Int? = null

            )

            data class Series(
                val available: Int? = null,
                val collectionURI: String? = null,
                val items: List<Items> = emptyList(),
                val returned: Int? = null

            )

            data class Stories(
                val available: Int? = null,
                val collectionURI: String? = null,
                val items: List<Items> = emptyList(),
                val returned: Int? = null

            )

            data class Events(
                val available: Int? = null,
                val collectionURI: String? = null,
                val items: List<Items> = emptyList(),
                val returned: Int? = null

            )

            data class Items(
                val resourceURI: String? = null,
                val name: String? = null
            )

            data class Urls(
                val type: String? = null,
                val url: String? = null
            )
        }
    }
}
