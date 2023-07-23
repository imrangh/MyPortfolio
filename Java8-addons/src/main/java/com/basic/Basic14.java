package com.basic;

public class Basic14 {
    public static void main(String[] args) {
        int row =1, column = 1;

        int x=1;
        do{

            column = 1;

            do{
                System.out.print(x + " ");
                column++;
                x++;
            }while(column <=5);
            System.out.println(" ");
            row++;
        }while(row <=5);
    }
}
