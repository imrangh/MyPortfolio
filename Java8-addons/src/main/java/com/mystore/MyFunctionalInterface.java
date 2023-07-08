package com.mystore;

@FunctionalInterface
public interface MyFunctionalInterface {
    void m1();

     default void m2(){
        System.out.println("Default method-1");
    }

    default void m3(){
        System.out.println("Default method-2");
    }

    default void m4(){
        System.out.println("Default method-3");
    }

}
