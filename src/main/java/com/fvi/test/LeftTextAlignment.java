package com.fvi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class LeftTextAlignment extends TextAlignmentBase {


    public LeftTextAlignment(int columnWidth) {
        super(columnWidth, 1);
    }

    public LeftTextAlignment(int columnWidth, int padding) {
        super(columnWidth, padding);
    }

    @Override
    public String format(String input) {

        List<String> matchList = new ArrayList<String>();
        Pattern regex = Pattern.compile(".{1," + columnWidth + "}(?:\\s|$)", Pattern.DOTALL);
        Matcher regexMatcher = regex.matcher(input);
        while (regexMatcher.find()) {
            matchList.add(regexMatcher.group());
        }

        List<String> formatted = matchList.stream().map(e ->
                rightPad(e, columnWidth))
                .collect(Collectors.toList());

        return String.join("\n", formatted);
    }
}
