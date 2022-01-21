package com.rbelchior.marvel.data.local.converter

import io.kotest.matchers.shouldBe
import org.junit.Test
import java.time.ZoneId
import java.time.ZonedDateTime

class DateConverterTest {

    @Test
    fun fromString() {

        DateConverter.fromString("1969-12-31T19:00:00-0500")!!.apply {
            year shouldBe 1969
            monthValue shouldBe 12
            dayOfMonth shouldBe 31
            hour shouldBe 19
            minute shouldBe 0
            second shouldBe 0
            zone shouldBe ZoneId.of("-05:00")
        }
    }

    @Test
    fun dateToString() {

        val stringDate = "1969-12-31T19:00:00-0500"
        val zonedDateTime = ZonedDateTime.parse(stringDate, DateConverter.dateFormatter)

        DateConverter.dateToString(zonedDateTime) shouldBe stringDate
    }
}
