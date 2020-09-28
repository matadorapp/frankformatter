package com.fvi.test;

public class RightTextAlignment extends TextAlignmentBase {

    public RightTextAlignment(int columnWidth, int padding) {
        super(columnWidth, padding);
    }

    public RightTextAlignment(int columnWidth) {
        super(columnWidth, 1);
    }

    @Override
    public String format(String input) {
        return String.format("|%" + columnWidth + "s|", String.format("%-" + padding + "s", input));
    }
}
