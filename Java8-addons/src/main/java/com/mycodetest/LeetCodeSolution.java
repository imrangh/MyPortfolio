package com.mycodetest;

import java.util.Arrays;

public class LeetCodeSolution {

    public static void main(String[] args) {
        int[] numbers = {3,2,1,4,7};

        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] indexOfTwoNumbers = new int[2];

        for (int i = 0; i < nums.length -1; i++) {

            for (int j = i+1; j < nums.length ; j++) {

                if (nums[i] + nums[j] == target) {
                    indexOfTwoNumbers[0] = i;
                    indexOfTwoNumbers[1] = j;

                    return  indexOfTwoNumbers;
                }
            }

        }

        return null;


    }

}
