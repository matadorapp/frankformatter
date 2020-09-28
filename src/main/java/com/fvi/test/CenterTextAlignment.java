package com.fvi.test;

public class CenterTextAlignment extends TextAlignmentBase {

    public CenterTextAlignment(int columnWidth) {
        super(columnWidth, 1);
    }

    @Override
    public String format(String s) {
        return String.format("|%s|", center(s, columnWidth, ' '));
    }

    // google solution
    private String center(String s, int size, char pad) {
        if (s == null || size <= s.length())
            return s;

        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < (size - s.length()) / 2; i++) {
            sb.append(pad);
        }
        sb.append(s);
        while (sb.length() < size) {
            sb.append(pad);
        }
        return sb.toString();
    }
}
