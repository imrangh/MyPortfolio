package com.mycodetest.lamdaexpression;

import java.util.ArrayList;
import java.util.Random;

//Java program to demonstrate simple lambda expressions
public class LambdaExpressionExample02 {

    public static void main(String[] args) {
        //Creating an ArrayList with elements random numbers
        ArrayList<Integer> numbers =  new ArrayList<>();
        Random random = new Random();
        numbers.add(random.nextInt(1000));
        numbers.add(random.nextInt(1000));
        numbers.add(random.nextInt(1000));
        numbers.add(random.nextInt(1000));

        //Print elements in the ArrayList
        numbers.forEach(System.out::println);
        System.out.println("------------------------------------");
        //Prints even numbers using the lambda expression
        numbers.forEach(n -> {
            if (n %2 ==0) {
                System.out.println(n + " Is even");
            }else{
                System.out.println(n + " Is not even");
            }
        });



    }
}
