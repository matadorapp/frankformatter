package com.fvi.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightTextAlignmentTest {

    String input = "This text should be right aligned ";

    @Test
    void testRightAlignmentWithcolumnWidth10() {
        TextAlignment alignment = new RightTextAlignment(10);

        String test = " This text\n should be\n     right\n   aligned";
        assertEquals(alignment.format(input), test);
    }

    @Test
    void testRightAlignmentWithcolumnWidth20() {
        TextAlignment alignment = new RightTextAlignment(20);

        String test = " This text should be\n       right aligned";
        assertEquals(alignment.format(input), test);
    }

}

