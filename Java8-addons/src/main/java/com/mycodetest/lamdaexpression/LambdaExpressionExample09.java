package com.mycodetest.lamdaexpression;

interface Func{
    // n is some natural number whose
    // factorial is to be computed
    void fact(int n);
}
public class LambdaExpressionExample09 {
    public static void main(String[] args) {
        // Block lambda expression
        Func f = (n) ->{
            // Block body

            // intially intializing with 1
            int res =1;

            // iterating from 1 to current number
            // to find factorial by multiplication
            for (int i = 1; i <=n; i++) {
                res = i * res;
            }
            System.out.println("Factorial of "+ n +": " + res);
            //return res;
        };



        // Calling lambda function

        // print and display n the console
        f.fact(6);
    }
}
