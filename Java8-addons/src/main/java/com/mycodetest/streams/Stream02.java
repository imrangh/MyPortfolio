package com.mycodetest.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stream02 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Google");
        list.add("Cin7");
        list.add("Microsoft");
        list.add("Amazon");

        Comparator<String> comparator = ((o1, o2) -> o1.compareTo(o2));

        Collections.sort(list, comparator);

        for (String s: list) {
            System.out.println(s);
        }
    }
}
