package com.rbelchior.marvel.data.remote

import com.rbelchior.marvel.data.remote.Mapper.toModel
import com.rbelchior.marvel.data.remote.model.CharactersDto
import com.rbelchior.marvel.data.remote.model.ComicsDto
import com.rbelchior.marvel.domain.Character
import com.rbelchior.marvel.domain.Comic
import com.squareup.moshi.Moshi
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import org.junit.Test

class MapperKtTest {

    @Test
    fun shouldParseCharactersDto() {
        Moshi.Builder().build()
            .adapter(CharactersDto::class.java)
            .fromJson(CharactersDtoMother.sampleResponse)
            .shouldNotBeNull()
    }

    @Test
    fun shouldMapCharactersDto() {
        Moshi.Builder().build()
            .adapter(CharactersDto::class.java)
            .fromJson(CharactersDtoMother.sampleResponse)!!
            .toModel()
            .first()
            .apply {

                name shouldBe "3-D Man"
                thumbnailUrl shouldBe "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg"
                urls shouldBe Character.Urls(
                    "http://marvel.com/comics/characters/1011334/3-d_man?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95",
                    "http://marvel.com/universe/3-D_Man_(Chandler)?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95",
                    "http://marvel.com/comics/characters/1011334/3-d_man?utm_campaign=apiRef&utm_source=08b9b0605d1303c6db21b022d4f33f95"
                )
                // continue testing other fields
            }
    }

    @Test
    fun shouldParseComicsListDto() {
        Moshi.Builder().build()
            .adapter(ComicsDto::class.java)
            .fromJson(ComicsDtoMother.comicsListSampleResponse)
            .shouldNotBeNull()
    }

    @Test
    fun shouldParseSingleComicDto() {
        Moshi.Builder().build()
            .adapter(ComicsDto::class.java)
            .fromJson(ComicsDtoMother.singleComicSampleResponse)
            .shouldNotBeNull()
    }

    @Test
    fun shouldMapComicsDto() {
        Moshi.Builder().build()
            .adapter(ComicsDto::class.java)
            .fromJson(ComicsDtoMother.singleComicSampleResponse)!!
            .toModel()
            .first()
            .apply {

                title shouldBe "Hulk (2008) #55"
                description shouldBe "The hands of the doomsday clock race towards MAYAN RULE! Former Avengers arrive to help stop the end of the world as more Mayan gods return. Rick \"A-Bomb\" Jones falls in battle!"
                thumbnailUrl shouldBe "http://i.annihil.us/u/prod/marvel/i/mg/6/60/5ba3d0869c543.jpg"

                creators shouldBe listOf(
                    Comic.Creator("Vc Clayton Cowles", "letterer"),
                    Comic.Creator("Dale Eaglesham", "penciller (cover)"),
                    Comic.Creator("Mark Paniccia", "editor"),
                    Comic.Creator("Jeff Parker", "writer"),
                    Comic.Creator("Val Staples", "colorist"),
                )
                // continue testing other fields
            }
    }

    @Test
    fun shouldParseDate() {
        Mapper.parseDate("2011-06-01T16:04:59-0400")!!.apply {
            year shouldBe 2011
            monthValue shouldBe 6
            dayOfMonth shouldBe 1
            hour shouldBe 16
            minute shouldBe 4
            second shouldBe 59
        }
    }

    @Test
    fun shouldParseSeriesId() {
        Mapper.parseId("http://gateway.marvel.com/v1/public/series/1613") shouldBe 1613
    }

    @Test
    fun shouldParseComicsId() {
        Mapper.parseId("http://gateway.marvel.com/v1/public/comics/2420") shouldBe 2420
    }
}
