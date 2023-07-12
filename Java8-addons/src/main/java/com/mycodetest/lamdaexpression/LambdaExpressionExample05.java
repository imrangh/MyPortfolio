package com.mycodetest.lamdaexpression;

import java.lang.reflect.Array;
import java.util.*;

public class LambdaExpressionExample05 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        numbers.add(random.nextInt(1000));
        numbers.add(random.nextInt(1000));
        numbers.add(random.nextInt(1000));
        numbers.add(random.nextInt(1000));
        numbers.add(random.nextInt(1000));

        System.out.println(numbers);
        //Collections.sort(numbers);
        numbers.sort(Comparator.comparingInt(o -> (int) o).reversed());

        System.out.println(numbers);


    }
}
