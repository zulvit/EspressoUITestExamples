package com.codingwithmitch.espressouitestexamples.ui.main

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest {

    @get: Rule
    val activityRule = ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun test_isActivityInView() {
        //Проверка отображения на дисплее главной активности
        onView(withId(R.id.secondary))
            .check(matches(isDisplayed()))

        //Проверка отображения на дисплее кнопки back
        onView(withId(R.id.button_back))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_isTitleTextDisplayed() {
        //Проверка совпадения текста кнопки back
        onView(withId(R.id.activity_secondary_title))
            .check(matches(withText(R.string.text_secondaryactivity)))
    }
}