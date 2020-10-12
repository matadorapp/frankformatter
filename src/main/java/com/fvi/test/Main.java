package com.fvi.test;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        if (args.length == 2) {
            String align = args[0];
            int width = Integer.parseInt(args[1]);

            Scanner in = new Scanner(System.in);
            System.out.print(" $> ");
            String s = in.nextLine();

            switch (align) {
                case "left":
                    TextAlignment left = new LeftTextAlignment(width);
                    System.out.println(left.format(s));
                    break;
                case "right":
                    TextAlignment rigth = new RightTextAlignment(width);
                    System.out.println(rigth.format(s));
                    break;
                default:
                    // code block
            }
        } else {
            System.out.println(" Program arguments is:");
            System.out.println(" 1. alignment (fx left, right, center, justify)");
            System.out.println(" 2. padding (fx 15)");
        }
    }
}