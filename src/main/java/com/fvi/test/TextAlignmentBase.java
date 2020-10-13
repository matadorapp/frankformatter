package com.fvi.test;

public abstract class TextAlignmentBase implements TextAlignment {

    protected int padding = 0;
    protected int columnWidth = 0;

    public TextAlignmentBase(int columnWidth, int padding) {
        this.columnWidth = columnWidth;
        this.padding = padding;
    }

    protected String rightPad(String inputString, int length) {
        return String.format("%1$-" + length + "s", inputString);
    }

    protected String leftPad(String inputString, int length) {
        return String.format("%1$" + length + "s", inputString);
    }

    protected String center(String str, final int size) {
        if (str == null || size <= 0) {
            return str;
        }
        final int strLen = str.length();
        final int pads = size - strLen;
        if (pads <= 0) {
            return str;
        }
        str = leftPad(str, strLen + pads / 2);
        str = rightPad(str, size);
        return str;
    }
}
