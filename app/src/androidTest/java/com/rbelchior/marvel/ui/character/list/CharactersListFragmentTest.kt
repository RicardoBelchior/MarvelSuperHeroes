package com.rbelchior.marvel.ui.character.list

import android.content.Context
import android.content.Intent
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.adevinta.android.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.adevinta.android.barista.interaction.BaristaClickInteractions.clickOn
import com.rbelchior.marvel.R
import com.rbelchior.marvel.ui.MainActivity
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class CharactersListFragmentTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    private val targetContext: Context
        get() = InstrumentationRegistry.getInstrumentation().targetContext

    @Before
    fun init() {
        hiltRule.inject()
    }

    @Test
    fun testGridIsDisplayed() {
        launch<MainActivity>(Intent(targetContext, MainActivity::class.java))

        assertDisplayed("Super Heroes")
        assertDisplayed(R.id.etSearch)

        // Ensure the first few elements are displayed
        // (according to the mocked MarvelService
        assertDisplayed("0 Test Hero")
        assertDisplayed("A-Bomb (HAS)")
        assertDisplayed("Abyss")
    }

    // Open character detail screen and test a few things
    @Test
    fun testOpenCharacterDetail() {
        launch<MainActivity>(Intent(targetContext, MainActivity::class.java))
        assertDisplayed("0 Test Hero")

        clickOn("0 Test Hero")
        assertDisplayed("12 comics")
        assertDisplayed("3 series")
        assertDisplayed("21 stories")
        assertDisplayed("1 events")
    }

    // Simple test to demonstrate how to follow through the screens of the app.
    @Test
    fun testFullNavigation() {
        launch<MainActivity>(Intent(targetContext, MainActivity::class.java))
        assertDisplayed("0 Test Hero")

        clickOn("0 Test Hero")
        assertDisplayed("12 comics")

        clickOn("12 comics")
        assertDisplayed("Comics")

        val comicName = "Marvel's Voices: Pride (2021) #1"
        assertDisplayed(comicName)

        clickOn(comicName)
        assertDisplayed(comicName)
        assertDisplayed("Published:")
        assertDisplayed("2021-06-23")
        assertDisplayed("Writer:")
        assertDisplayed("Vita Ayala")
    }


}
