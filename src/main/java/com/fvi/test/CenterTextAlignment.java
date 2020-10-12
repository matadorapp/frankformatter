package com.fvi.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CenterTextAlignment extends TextAlignmentBase {

    public CenterTextAlignment(int columnWidth) {
        super(columnWidth, 1);
    }

    @Override
    public String format(String input) {
        String[] parts = input.split("(?<=\\G.{" + columnWidth + "})");
        List<String> list = Arrays.asList(parts);

        List<String> formatted = list.stream().map(e ->
                center(e, columnWidth))
                .collect(Collectors.toList());

        return String.join("\n", formatted);
    }

    private String center(String str, final int size) {
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

    private String leftPad(String inputString, int length) {
        return String.format("%1$" + length + "s", inputString);
    }

    private String rightPad(String inputString, int length) {
        return String.format("%1$-" + length + "s", inputString);
    }

}
