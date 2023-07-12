package com.mycodetest.lamdaexpression;


import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*Algorithm:
        Get the string
        Match the string:
        Check if the string is empty or not. If empty, return false
        Check if the string is null or not. If null, return false.
        If the string is neither empty nor null,
        then check using Lambda Expression Character::isLetter().
        Return true if matched
*/
interface AlphabetCheck{
    boolean isAlphabet(String stringToBeChecked);
}
public class LambdaExpressionExample {
    public static void main(String[] args) {

        AlphabetCheck alphabetCheck = (stringToBeChecked) -> {

            return ((stringToBeChecked != null) && (!stringToBeChecked.equals("")) && (stringToBeChecked.chars().allMatch(Character::isAlphabetic)));
        };

        System.out.println(alphabetCheck.isAlphabet(null));

    }
}
