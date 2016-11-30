package com.cooltechworks.creditcarddesign;


import org.junit.Test;

import android.os.Build;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.M)
public class CardEditActivityTest {

    @Test
    public void getNextButtonTextId() throws Exception {
        CardEditActivity cardEditActivity = new CardEditActivity();
        assertEquals(R.string.next, cardEditActivity.getNextButtonTextRes(2, 0));
        assertEquals(R.string.done, cardEditActivity.getNextButtonTextRes(2, 1));
    }

    @Test
    public void getNextButtonText() throws Exception {
        CardEditActivity cardEditActivity = new CardEditActivity();
        assertEquals("NEXT", RuntimeEnvironment.application.getString(cardEditActivity.getNextButtonTextRes(2, 0)));
        assertEquals("DONE", RuntimeEnvironment.application.getString(cardEditActivity.getNextButtonTextRes(2, 1)));
    }

}