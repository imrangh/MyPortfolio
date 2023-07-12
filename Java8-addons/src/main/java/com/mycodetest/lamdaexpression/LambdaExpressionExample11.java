package com.mycodetest.lamdaexpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaExpressionExample11 {

    // key will act as an id of the value
    private Integer key;

    // value will be the value of the above key
    private String value;

    public LambdaExpressionExample11(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

class Main{
    public static void main(String[] args) {
        // Creating a List of type ListItems using ArrayList
        List<LambdaExpressionExample11> list = new ArrayList<>();

        // add the number of list
        list.add(new LambdaExpressionExample11(1, "I"));
        list.add(new LambdaExpressionExample11(2, "Love"));
        list.add(new LambdaExpressionExample11(3,"Geeks"));
        list.add(new LambdaExpressionExample11(4, "For"));
        list.add(new LambdaExpressionExample11(5, "Geeks"));

        // Map which will store the list items
        Map<Integer, String> map = new HashMap<>();

        // for (LambdaExpressionExample11 n: list) {map.put(n.getKey())},
        // n.getValue();}
        // the below lambda performs the same task as the above given
        // for loop will do
        // put list items on the map
        list.forEach(n-> {
            map.put(n.getKey(), n.getValue());
        });

        // printing the given map
        System.out.println("Map : " + map);
    }
}
