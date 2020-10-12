package com.fvi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class LeftTextAlignment extends TextAlignmentBase {


    public LeftTextAlignment(int columnWidth) {
        super(columnWidth, 1);
    }

    public LeftTextAlignment(int columnWidth, int padding) {
        super(columnWidth, padding);
    }

    @Override
    public String format(String input) {
        String[] parts = input.split("(?<=\\G.{" + columnWidth + "})");
        List<String> list = Arrays.asList(parts);
        return String.join("\n", list);
    }
}
