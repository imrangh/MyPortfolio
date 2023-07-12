package com.mycodetest.lamdaexpression;

public class LambdaExpressionExample01 {

    public static void main(String[] args) {

        /*
        * lamba expression to implement MyFuctionalInterface interface.
        * This interface by default implements myAbstractFunc()
        * */
        MyFunctionalInterface myFunctionalInterface = (x) -> System.out.println(2*x);

        // This calls above lambda expression and prints 10.
        myFunctionalInterface.myAbstractFunc(5);
    }
}
