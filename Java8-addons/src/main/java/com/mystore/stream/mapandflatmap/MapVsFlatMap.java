package com.mystore.stream.mapandflatmap;

import com.mystore.stream.api.example.DataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

        List<Customer> customers = CustomerDataBase.getAll();

        //List<Customer> -> List<String> ==> Data Transformation
        //mapping : customer -> customer.getEmail()  === one-to-one mapping
        List<String> emails = customers.stream().map(Customer::getEmail).collect(Collectors.toList());
        System.out.println(emails);

        //Customer::getPhoneNumbers  ==> one-to-many mapping
        List<List<String>> phoneNumbers = customers.stream().map(Customer::getPhoneNumbers).toList();
        System.out.println(phoneNumbers);

        List<String> phoneNumbersFlat = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).toList();
        System.out.println(phoneNumbersFlat);

    }
}
