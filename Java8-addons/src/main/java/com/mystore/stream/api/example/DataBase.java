package com.mystore.stream.api.example;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Employee> getEmployees(){

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 45000));
        list.add(new Employee(338, "Mahanama", "CIVIL", 90000));
        list.add(new Employee(276, "Niroshan", "DEFENCE", 50000));
        list.add(new Employee(556, "Suloshan", "CORE", 40000));
        list.add(new Employee(176, "Prashan", "SOCIAL", 120000));
        return list;

    }
}
