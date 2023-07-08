package com.mystore.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        for(String s: list){
            System.out.println(s);
        }

        list.forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.forEach((k,v)-> System.out.println(k + ":" + v ));

        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(System.out::println);

        list.stream().filter(t->t.startsWith("t")).forEach(System.out::println);


    }
}
