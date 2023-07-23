package com.mycodetest.streams;

import java.util.stream.Stream;

public class Stream05 {
    public static void main(String[] args) {
        // creating a stream of strings
        Stream<String> myStream = Stream.of("Like", "and", "Share", "https://www.geeksofgeeks.org/");

        myStream.filter(x->x.startsWith("https://")).forEach(System.out::println);
    }
}
