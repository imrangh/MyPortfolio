package com.mycodetest.streams;

import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge01 {

    // Challenge - Java program to count the occurrence of each character in string

    static String str = "ilovejavatechie";

    public static void findCharacterOccurences(String str){

        List<String> list = List.of(str.split(""));


        System.out.println(list);

        // Print the character occurences of a string
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        // Print duplicates characters
        Map<String, Long> map2 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> duplicates = map2.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println(duplicates);

        // Print unique characters
        Map<String, Long> map3 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> uniqueChars = map3.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).toList();
        System.out.println(uniqueChars);

        // Print the first unique letter in the string
        Map<String, Long> map4 = list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String key = map4.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println(key);


    }

    public static void findTheSecondHighestValue(){

        int[] numbers = {5,9,11,2,8,21,1};

        // Second highest number
        Integer secondHighestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighestNumber);

        // Second lowest number
        Integer secondLowestNumber = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();
        System.out.println(secondLowestNumber);

        // Print the numbers start with 1
        List<String> listStratWithOne = Arrays.stream(numbers)
                .boxed()
                .map(x -> x + "")
                .filter(x -> x.startsWith("1"))
                .toList();
        System.out.println(listStratWithOne);

    }

    public static void findLongestStringInArray() {
        String[] strArray = {"java", "techie", "springboot", "microservices"};

        String s = Arrays.stream(strArray).reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println(s);

    }



    public static void main(String[] args) {
        findCharacterOccurences(str);
        findTheSecondHighestValue();
        findLongestStringInArray();

    }

}
