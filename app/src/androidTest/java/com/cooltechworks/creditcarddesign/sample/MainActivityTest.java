package com.cooltechworks.creditcarddesign.sample;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.cooltechworks.checkoutflow.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {

        onView(withId(R.id.add_card)).perform(scrollTo(), click());

        onView(withId(R.id.card_number_field)).perform(typeText("4970 1000 0000 0000"));
        onView(withId(R.id.card_expiry)).perform(typeText("1223"));
        onView(withId(R.id.card_cvv)).perform(typeText("456"));
        onView(withId(R.id.card_name)).perform(typeText("JEAN MARTIN"));

        onView(withId(R.id.next)).perform(click());

        onView(withId(R.id.front_card_number)).check(matches(withText("4970  1000  0000  0000")));
        onView(withId(R.id.front_card_holder_name)).check(matches(withText("JEAN MARTIN")));
        onView(withId(R.id.front_card_expiry)).check(matches(withText("12/23")));
    }
}
