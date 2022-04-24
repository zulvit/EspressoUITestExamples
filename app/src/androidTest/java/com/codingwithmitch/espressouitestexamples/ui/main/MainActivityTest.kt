package com.codingwithmitch.espressouitestexamples.ui.main

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.R
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {
    @Test
    fun test_isActivityInView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        //проверка отображения MainActivity
        onView(withId(R.id.main))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_title_nextButton() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        //Проверка отображения кнопки next activity
        onView(withId(R.id.button_next_activity))
            .check(matches(isDisplayed()))

        //region method 2
        //onView(withId(R.id.button_next_activity))
        //    .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        //endregion

        //Проверка отображения главного текста в activity
        onView(withId(R.id.activity_main_title))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_isTitleTextDisplayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        //проверка совпадения текста на экране
        onView(withId(R.id.activity_main_title))
            .check(matches(withText("MainActivity")))
    }
}









