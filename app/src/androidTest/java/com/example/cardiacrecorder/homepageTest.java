package com.example.cardiacrecorder;




import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.os.SystemClock;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.junit.Test;
@RunWith(JUnit4.class)

public class homepageTest {
    @Rule
    public ActivityScenarioRule<homepage> activityRule =
            new ActivityScenarioRule<homepage>(homepage.class);
    @Test
    public void addta(){

        onView(withId(R.id.history)).perform(click());
        onView(withId(R.id.Measure)).check(matches(isDisplayed()));
        SystemClock.sleep(5000);
    }

}