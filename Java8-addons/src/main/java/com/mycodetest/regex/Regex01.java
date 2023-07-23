package com.mycodetest.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {
    /**
     *
     *  [abc]   A single character of: a, b, or c
     *  [a-z]   A single character in a range: a to z
     *  a|b     Match either a or b
     *  \d      A digit: [0-9]
     *  \w      A word character: [a-zA-Z_0-9]
     *  .       Any single character
     *  a{3}    Exactly 3 of a: aaa
     *  a{3,}   3 or more of a
     *  a{2,4}  between 2 or 4 of a: aa, aaa, or aaaa
     *  ^       The begining of a line
     *  $       The end of a line
     *  *       Matches zero or more occurrences.
     *  +       Matches one or more occurrences.
     *  ?       Matches zero or one occurrences.
     *
     * */

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("agent \\d{3}");
        Matcher matcher = pattern.matcher("agent 2288");

        boolean found = matcher.find();
        System.out.println(found);
    }
}
