package com.basic;

import java.util.Scanner;

public class Basic03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0;

        while (sc.hasNextInt()) {

            int num = sc.nextInt();
            sum += num;
            count++;
        }

        if(count>0){
            int mean = sum/count;
            System.out.println("Mean: " + mean);
        }else{
            System.out.println("No intgers were input. Mean cannot be calculated");
        }


    }
}
