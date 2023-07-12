package com.mycodetest.lamdaexpression;

//Java program to demonstrate working of lambda expressions
public class LambdaExpressionExample03 {

    //operation is implemented using lambda expressions
    interface CalcInterface {
        int calcOperation(int a, int b);
    }

    //printMessage() is implemented using lambda expressions
    interface PrintMessageInterface{
        void printMessage(String message);
    }

    //Performs CaclInterface's calcOperation on 'a' and 'b'
    private int doCalc(int a, int b, CalcInterface calc){
        return calc.calcOperation(a,b);
    }

    public static void main(String[] args) {
        // lambda expression for addition for two parameters
        // data type for x and y is optional.
        // This expression implements 'CalcInterface' interface
        CalcInterface add = (Integer::sum); // (a, b) -> a+ b

        // lambda expression multiplication for two parameters
        // This expression also implements 'CalcInterface' interface
        CalcInterface multiply = (int a, int b) -> a* b;

        // Creating an object of LambdaExpressionExample03 to call doCalc
        // using different implementations using lambda expressions
        LambdaExpressionExample03 lambdaEE = new LambdaExpressionExample03();

        System.out.println("Addition: " + lambdaEE.doCalc( 2,3,add));

        System.out.println("Multiplication: " + lambdaEE.doCalc(4,5, multiply));

        PrintMessageInterface printMessage = (message -> System.out.println("Hello " + message));

        printMessage.printMessage("Imran");

    }
}
