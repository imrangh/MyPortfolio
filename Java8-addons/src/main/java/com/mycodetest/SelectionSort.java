package com.mycodetest;

import java.util.Arrays;
import java.util.Random;

import static java.util.Collections.swap;

public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = new int[10000];
        Random random = new Random();

        for (int i =0; i<numbers.length ; i++){
            numbers[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(numbers));
        long startTime = System.currentTimeMillis();
        selectionSort(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(numbers));
        System.out.println("Time taken to sort: " + (endTime - startTime));
    }

    private static void selectionSort(int[] numbers) {
        for(int i=0; i< numbers.length -1; i++){
            int min = numbers[i];
            int indexOfMin = i;
            for(int j = i+1 ;  j< numbers.length; j++){
                if(numbers[j]< min){
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, indexOfMin, i);
        }
    }

    private static void swap(int[] numbers, int indexOfMin, int i) {
        int temp = numbers[indexOfMin];
        numbers[indexOfMin] = numbers[i];
        numbers[i] = temp;
    }

}
