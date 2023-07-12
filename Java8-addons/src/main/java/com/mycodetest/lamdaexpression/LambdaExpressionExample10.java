package com.mycodetest.lamdaexpression;

// functional interface named New
interface New{

    // Boolean function to check over
    // natural number depicting calendar year
    // 'n' depicting year is passed as an parameter
    boolean test(int n);
}
public class LambdaExpressionExample10 {
    public static void main(String[] args) {
        New leapyr = (n)->{

            // Condition check
            // If year is divisible by 400 or
            // the year is divisible by 4 and 100 both
            if(n % 400 == 0 || (((n % 4) == 0) && ((n % 100) != 0))){
                System.out.println("Year " + n + " is a leap year");
                return true;
            }else{
            System.out.println("Year " + n + " is not a leap year");
            return false;
            }
        };

        leapyr.test(2020);
    }
}
