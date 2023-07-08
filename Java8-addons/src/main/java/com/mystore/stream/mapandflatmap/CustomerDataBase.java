package com.mystore.stream.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDataBase {

    public static List<Customer> getAll(){

        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("23455", "7979679")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("68623455", "766579")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("28080", "112009")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("801225", "17009869"))).collect(Collectors.toList());

    }
}
