package com.fvi.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenterTextAlignmentTest {

    String input = "This text should be center aligned";

    @Test
    void testCenterAlignmentWithcolumnWidth10() {
        TextAlignment alignment = new CenterTextAlignment(10);

        String test = "This text \nshould be \n center   \n aligned  ";
        assertEquals(alignment.format(input), test);
    }

    @Test
    void testCenterAlignmentWithcolumnWidth20() {
        TextAlignment alignment = new CenterTextAlignment(20);

        String test = "This text should be \n   center aligned   ";
        assertEquals(alignment.format(input), test);
    }

}

