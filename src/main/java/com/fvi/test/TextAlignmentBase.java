package com.fvi.test;

public abstract class TextAlignmentBase implements TextAlignment {

    protected int padding = 0;
    protected int columnWidth = 0;

    public TextAlignmentBase(int columnWidth, int padding) {
        this.columnWidth = columnWidth;
        this.padding = padding;
    }

}
