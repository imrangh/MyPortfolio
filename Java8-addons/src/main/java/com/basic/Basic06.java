package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic06 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = System.console().readLine();

        System.out.println("You entered string " + name);

        System.out.println("Enter a integer: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter a String: ");
        String b = br.readLine();

        System.out.println("You have entered : " + a + " and name as " + b);



    }
}
