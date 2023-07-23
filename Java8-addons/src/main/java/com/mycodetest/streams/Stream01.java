package com.mycodetest.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream01 {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        Random random = new Random();
        marks.add(random.nextInt(35, 100));
        marks.add(random.nextInt(40, 100));
        marks.add(random.nextInt(45, 100));
        marks.add(random.nextInt(50, 100));
        marks.add(random.nextInt(60, 100));

        System.out.println(marks);

        /**
         *  Now we want to grace marks by 6 using the streams
         *  to process over processing collections
         *
         *  Using Stream, we map every object and later collect
         *  to List and store them
         * */

        List<Integer> updatedMarks = marks.stream()
                .map(m -> m +6)
                .toList();

        System.out.println(updatedMarks);


    }
}
