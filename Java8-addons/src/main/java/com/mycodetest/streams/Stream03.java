package com.mycodetest.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream03 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Google");
        list.add("Cin7");
        list.add("Microsoft");
        list.add("Amazon");

        List<String> comList = list.stream().sorted().toList();
        System.out.println(comList);
    }
}
