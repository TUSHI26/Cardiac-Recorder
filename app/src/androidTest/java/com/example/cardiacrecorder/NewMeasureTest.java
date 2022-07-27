
package com.example.cardiacrecorder;
//import static org.junit.Assert.*;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
//import androidx.test.uiautomator.UiDevice;

import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.junit.Test;
@RunWith(JUnit4.class)
@LargeTest
public class NewMeasureTest {

    @Rule
    public ActivityScenarioRule<NewMeasure> activityRule =
            new ActivityScenarioRule<NewMeasure>(NewMeasure.class);
    @Test
    public void newmeasure(){

        onView(withId(R.id.systolic)).perform(ViewActions.typeText("126"));
        Espresso.pressBack();
        onView(withId(R.id.diastolic)).perform(ViewActions.typeText("62"));
        // Espresso.pressBack();
        onView(withId(R.id.pulse)).perform(ViewActions.typeText("52"));
        Espresso.pressBack();
        onView(withId(R.id.button3)).perform(click());

    }



