package com.basic;

import java.util.Scanner;

public class Basic05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer & a String");

        int a = sc.nextInt();

        String b = sc.nextLine();

        System.out.println("You have entered : " + a + " and name as " + b);
    }
}
