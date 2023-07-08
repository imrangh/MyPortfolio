package com.mystore.stream.mapandflatmap;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Customer customer = new Customer(101, "john", "null", Arrays.asList("23455", "7979679"));

        //empty
        Optional<Object> emptyOptional = Optional.empty();
        //of
        //Optional<String> ofOptional = Optional.of(customer.getEmail());
        //ofNullable
        Optional<String> ofNullableOptional = Optional.ofNullable(customer.getEmail());
        ofNullableOptional.ifPresent(System.out::println);
        System.out.println(ofNullableOptional.orElse("default"));
    }
}
