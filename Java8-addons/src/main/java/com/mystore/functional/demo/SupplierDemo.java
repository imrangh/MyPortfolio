package com.mystore.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {

    public static void main(String[] args) {


//        System.out.println(supplier.get());

        List<String> list1 = List.of();
        System.out.println(list1.stream().findAny().orElseGet(()-> "default text"));
    }
}
