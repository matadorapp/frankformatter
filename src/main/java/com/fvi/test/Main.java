package com.fvi.test;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        if (args.length == 2) {
            String align = args[0];
            int padding = Integer.parseInt(args[1]);

            Scanner in = new Scanner(System.in);
            System.out.print(" $> ");
            String s = in.nextLine();
            System.out.println("You entered string " + s);

            switch (align) {
                case "left":
                    TextAlignment left = new LeftTextAlignment(70, padding);
                    System.out.println(left.format(s));
                    break;
                case "right":
                    TextAlignment rigth = new RightTextAlignment(70, padding);
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