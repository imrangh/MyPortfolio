package com.mycodetest.lamdaexpression;

//A sample functional interface
// An interface with single abstract method
public interface MyFunctionalInterface {

    //An abstract function
    void myAbstractFunc(int x);

    //A non-abstract (or default) function
    default void myNonAbstarctFunc(){
        System.out.println("Hello");
    }

}
