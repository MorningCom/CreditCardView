package com.cooltechworks.creditcarddesign;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardEditActivityTest {

    @Test
    public void getNextButtonText() throws Exception {
        CardEditActivity cardEditActivity = new CardEditActivity();
        assertEquals(R.string.next, cardEditActivity.getNextButtonTextRes(2, 0));
        assertEquals(R.string.done, cardEditActivity.getNextButtonTextRes(2, 1));
    }

}