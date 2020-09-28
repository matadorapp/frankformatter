package com.fvi.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextAlignmentTest {

    @Test
    void jshell_repl_exploratory() {

        // padding
        assertEquals(String.format("%-12s", "fvi"), "fvi         ");
        assertEquals(String.format("%12s", "fvi"), "         fvi");

        // align
        assertEquals(String.format("|%50s|", "fvi"), "|                                               fvi|");
        assertEquals(String.format("|%-50s|", "fvi"), "|fvi                                               |");

        // padding and align
        assertEquals(String.format("|%-50s|", String.format("%30s", "123456789")), "|                     123456789                    |");
        assertEquals(String.format("|%-50s|", String.format("%-20s", "123456789")), "|123456789                                         |");
        assertEquals(String.format("|%-50s|", String.format("%20s", "123456789")), "|           123456789                              |");
        assertEquals(String.format("|%50s|", String.format("%-12s", "123456789")), "|                                      123456789   |");
    }

    @Test
    void testInterfaceDefinition() {
        class TeZT implements TextAlignment {
            @Override
            public String format(String s) {
                return s;
            }
        }
        assertEquals(new TeZT().format("TZeT"), "TZeT");
    }

    @Test
    void testLeftAlign() {
        TextAlignment left = new LeftTextAlignment(20);
        assertEquals(left.format("left aligned"), "|left aligned        |");
    }

    @Disabled("Disabled until padding bug #42 has been resolved")
    @Test
    void testLeftAlignWithPadding() {
        TextAlignment left = new LeftTextAlignment(30, 20);
        assertEquals(left.format("with padding"), "|            with padding      |", "Padding is wrong! It's including word itself");
    }

    @Test
    void testRightAlign() {
        TextAlignment right = new RightTextAlignment(20);
        assertEquals(right.format("right aligned"), "|       right aligned|");
    }

    @Test
    void testRightAlignWithPadding() {
        TextAlignment right = new RightTextAlignment(30, 20);
        assertEquals(right.format("right aligned"), "|          right aligned       |");
    }

    @Test
    void testCenterAlign() {
        TextAlignment right = new CenterTextAlignment(21);
        assertEquals(right.format("center"), "|       center        |");
    }
}
