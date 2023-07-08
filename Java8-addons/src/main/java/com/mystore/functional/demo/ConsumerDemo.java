package com.mystore.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

      /*  Consumer<Integer> consumer = t -> System.out.println("Printing : " + t * 10);
        consumer.accept(1000);*/

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.stream().forEach(t-> System.out.println("Print: " + t));

    }
}
