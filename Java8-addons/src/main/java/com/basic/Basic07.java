package com.basic;

public class Basic07 {
    public static void main( String[] args) {
        if (args.length > 0){
            System.out.println("The command line arguments are: ");
            for(String val: args) System.out.println(val);
        }else {
            System.out.println("No command line args found");
        }
    }
}
