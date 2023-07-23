package com.basic;

public class Basic08 {
    public static void main(String[] args) {
        int x = 100;
        System.out.printf("Printing simple integer: x = %d\n", x);

        // prints upto 2 decimals
        System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI);

        float n = 2.5f;
        // appends zeros to the rightmost end of the decimals
        System.out.printf("Formatted to specific width: n = %.4f\n", n);

        double n1 = 23536739.3d;
        // When I was using float it rounds the value instead to get the exact value passed need to use the double
        // For more clarity refer below stackoverflow page
        // https://stackoverflow.com/questions/53282550/how-can-i-fix-my-floats-being-rounded-down-to-doubles/53284114#53284114
        System.out.printf("Formatted to right margin: n1= %.2f\n", n1);

    }
}
