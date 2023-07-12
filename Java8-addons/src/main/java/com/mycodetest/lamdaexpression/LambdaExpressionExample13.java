package com.mycodetest.lamdaexpression;

import java.util.*;
import java.util.function.Predicate;

public class LambdaExpressionExample13 {

    // generic function to remove elements using predicate
    public static <T> List<T> removeElements(List<T> l, Predicate<T> p){

        // create collection using Predicate
        Collection<T> collection = new ArrayList<>();

        for (T t: l){
            if (p.test(t)){
                collection.add(t);
            }
        }

        System.out.println("Collection to be removed: " + collection);

        // removing 10 using List.removeAll()
        // passing a collection
        l.removeAll(collection);

        return l;
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>(
                Arrays.asList("1","10", "15", "12", "5", "10", "20")
        );

        System.out.println(l);

        Predicate<String> is10 = i -> (i== "10");

        l = removeElements(l, is10);

        System.out.println(l);
    }
}
