package com.fvi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

        List<String> matchList = new ArrayList<String>();
        Pattern regex = Pattern.compile(".{1," + columnWidth + "}(?:\\s|$)", Pattern.DOTALL);
        Matcher regexMatcher = regex.matcher(input);
        while (regexMatcher.find()) {
            matchList.add(regexMatcher.group());
        }

        List<String> formatted = matchList.stream().map(String::trim).map(e ->
                leftPad(e, columnWidth))
                .collect(Collectors.toList());

        return String.join("\n", formatted);
    }
}
