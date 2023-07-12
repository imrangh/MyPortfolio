package com.mycodetest.lamdaexpression;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExpressionExample12 {

    // generic function to remove null using iterator
    public static <T> List<T> removeNullUsingIterator(List<T> l, Predicate<T> p){

        // Create an iterator from the l
        Iterator<T> itr = l.iterator();

        // find and remove all nulls
        while (itr.hasNext()){

            // fetch the next element
            T t = itr.next();

            // checking for predicate condition
            if(!p.test(t)){
                // if the condition matches, remove that element
                itr.remove();
            }
        }

        return  l;
    }

    public static <T> List<T> removeNullUsingStreams(List<T> l, Predicate<T> p){

        l = l.stream().filter(p).collect(Collectors.toList());


        return  l;
    }

    public static <T> List<T> removeElements(List<T> l, Predicate<T> p){

        l.removeIf(p::test);


        return  l;
    }

    public static void main(String[] args) {
        // create the l with null values
        List<String> l = new ArrayList<>(
                Arrays.asList(
                        "Geeks",
                        null,
                        "forGeeks",
                        null,
                        "A computer portal"
                )
        );

        List<String> l2 = new ArrayList<>(
                Arrays.asList(
                        "Geeks2",
                        null,
                        "forGeeks2",
                        null,
                        "A computer portal2"
                )
        );

        List<String> l3 = new ArrayList<>(
                Arrays.asList(
                        "Geeks3",
                        null,
                        "forGeeks3",
                        null,
                        "A computer portal3"
                )
        );

        System.out.println(l);

        // Creating a predicate condition checking for null
        Predicate<String> isNull = item -> Objects.nonNull(item);

        // removing nulls using iterator and predicate
        l = removeNullUsingIterator(l, isNull);


        System.out.println(l);

        l2 = removeNullUsingStreams(l2, isNull);


        System.out.println(l2);

        Predicate<String> isNull3 = item -> (item == null);

        l3 = removeElements(l3, isNull3);


        System.out.println(l3);
    }
}
