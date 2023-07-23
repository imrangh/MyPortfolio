package com.mycodetest.streams;

import java.util.*;

public class Stream04 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            list.add(random.nextInt(1,10));
        }
        System.out.println(list);

        ArrayList<Integer> reduced = list.stream().reduce(new ArrayList<Integer>(), (a, b) -> {

            if (b % 2 == 0)
                a.add(b);
            return a;

        }, (a, b) -> {
            a.addAll(b);
            return a;
        });

        System.out.println(reduced);

    }
}
