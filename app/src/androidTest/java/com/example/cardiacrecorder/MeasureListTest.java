
package com.example.cardiacrecorder;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import static org.hamcrest.core.IsAnything.anything;

import android.os.SystemClock;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.junit.Test;
@RunWith(JUnit4.class)

public class MeasureListTest {
    @Rule
    public ActivityScenarioRule<MeasureList> activityRule =
            new ActivityScenarioRule<MeasureList>(MeasureList.class);

    @Test
    public void addata(){
        SystemClock.sleep(5000);
       // onData(anything()).inAdapterView(withId(R.id.MeasureList)).atPosition(14).perform(click());

    }
    // @Test



