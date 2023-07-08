package com.mystore.stream.sort;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        List<Map.Entry<String, Integer>> entries =  new ArrayList<>(map.entrySet());
        entries.sort((o1, o2)-> o1.getKey().compareTo(o2.getKey()));

        for(Map.Entry<String, Integer> entry: entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("################################################");
        entries.sort((o1, o2)-> o1.getValue().compareTo(o2.getValue()));

        for(Map.Entry<String, Integer> entry: entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("################################################");

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}
