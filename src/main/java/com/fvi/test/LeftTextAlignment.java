package com.fvi.test;

public class LeftTextAlignment extends TextAlignmentBase {


    public LeftTextAlignment(int columnWidth) {
        super(columnWidth, 1);
    }

    public LeftTextAlignment(int columnWidth, int padding) {
        super(columnWidth, padding);
    }

    @Override
    public String format(String input) {
        return String.format("|%-" + columnWidth + "s|", String.format("%" + padding + "s", input));
    }
}
