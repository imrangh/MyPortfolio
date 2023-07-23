package com.basic;

import java.text.DecimalFormat;

public class Basic09 {

    public static void main(String[] args) {
        double num = 123.4567;

        DecimalFormat ft = new DecimalFormat("####");
        System.out.println("Without fraction part: num = " + ft.format(num));

        // Prints upto two decimals and rounds the value
        ft = new DecimalFormat("#.##");
        System.out.println("Formatted to give precision: num = " + ft.format(num));

        // appends zero for the rest of the rightmost part of the number.
        ft = new DecimalFormat("#.000000");
        System.out.println("append zeros to right: num = " + ft.format(num));

        ft = new DecimalFormat("00000.00");
        System.out.println("formatting numeric part : num = " + ft.format(num));

        double income = 23456.789;
        ft = new DecimalFormat("$###,###.##");
        System.out.println(ft.format(income));
    }
}
