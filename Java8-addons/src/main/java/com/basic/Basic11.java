package com.basic;

public class Basic11 {
    public static void main(String[] args) {
        int i = 20;

        if (i == 10) System.out.println("i is 10");
        else if (i == 15) System.out.println("i is 15");
        else if (i == 20) System.out.println("i is 20");
        else System.out.println("i is not present");

        i = 10;
        switch (i) {
            case 5:
                System.out.println("i is 5");
                break;
            case 10:
                System.out.println("i is 10");
                break;
            case 15:
                System.out.println("i is 15");
                break;
            case 20:
                System.out.println("i is 20");
                break;
            default:
                System.out.println("Not present");
        }
    }
}
