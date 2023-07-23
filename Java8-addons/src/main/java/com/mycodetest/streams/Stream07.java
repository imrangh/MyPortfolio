package com.mycodetest.streams;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Stream07 {


    public static void filterByIndexUsingAtomic(){
        String[] myArray = new String[] {
                "stream",
                "is",
                "a",
                "sequence",
                "of",
                "elements",
                "like",
                "list"
        };

        Stream<String> myStream = Stream.of(myArray);

        AtomicInteger i = new AtomicInteger(0);

        myStream.filter(x-> i.getAndIncrement() % 2 ==0).forEach(System.out::println);
    }

    public static void main(String[] args) {
        filterByIndexUsingAtomic();
    }



}
