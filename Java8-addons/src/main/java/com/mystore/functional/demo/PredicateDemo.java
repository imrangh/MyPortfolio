package com.mystore.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.stream().filter(t -> t % 2 == 0).forEach(t-> System.out.println("Print event: " + t));
    }
}
