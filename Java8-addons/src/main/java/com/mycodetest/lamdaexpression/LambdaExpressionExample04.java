package com.mycodetest.lamdaexpression;

import com.mystore.MyFunctionalInterface;

// Functional interface without parameters
interface Test1 {
    void print();
}

// functional interface with one parameter
interface Test2 {
    void print(Integer p);
}

// functional interface with two parameters
interface Test3{
    // The void type and the Integer type is automatically
    // inferred from here and assign to the lambda expression
    void print(Integer p1, Integer p2);
}
public class LambdaExpressionExample04 {

    //functional interface parameter is passed
    static void fun(Test1 t) {
        t.print();
    }

    static void fun2(Test2 t2, Integer p){
        t2.print(p);
    }

    // takes the parameter of Test3 type followed
    // by two Integer parameters p1 and p2
    static void fun3(Test3 t3, Integer p1, Integer p2){
        t3.print(p1, p2);
    }
    public static void main(String[] args) {
        //lambda expression is passed without
        //parameter to functional interface t
        fun(()-> System.out.println("Hello!"));

         Test2 t2= (a) -> {
            int b = 4;
            int sum = a + b;
            System.out.println(sum);
        };

        //t1.print();

        // lambda expression is passed with a single parameter
        // lambda expression is mapped to the single aregument abstract function
        // in the functional interface Test2
        fun2(t2, 5);

        Test3 t3 = (p1, p2) ->{
            System.out.println("Here my parameter p1: " + p1 + " and parameter p2 : " + p2 );
        };

        fun3(t3, 34, 67);
    }
}
