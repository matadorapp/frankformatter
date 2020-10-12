package com.fvi.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightTextAlignment extends TextAlignmentBase {

    public RightTextAlignment(int columnWidth, int padding) {
        super(columnWidth, padding);
    }

    public RightTextAlignment(int columnWidth) {
        super(columnWidth, 1);
    }

    @Override
    public String format(String input) {
        String[] parts = input.split("(?<=\\G.{" + columnWidth + "})");
        List<String> list = Arrays.asList(parts);
        List<String> list2 = list.stream().map(e -> String.format("%" + columnWidth + "s", e.trim())).collect(Collectors.toList());
        return String.join("\n", list2);
    }
}
