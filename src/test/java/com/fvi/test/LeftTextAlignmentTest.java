package com.fvi.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftTextAlignmentTest {

    String input = "This text should be left aligned ";

    @Test
    void testLeftAlignmentWithcolumnWidth10() {
        TextAlignment alignment = new LeftTextAlignment(10);

        String test = "This text \nshould be \nleft      \naligned ";
        assertEquals(alignment.format(input), test, "fix word-wrap");
    }

    @Test
    void testLeftAlignmentWithcolumnWidth20() {
        TextAlignment alignment = new LeftTextAlignment(20);

        String test = "This text should be \nleft aligned ";
        assertEquals(alignment.format(input), test);
    }

}
