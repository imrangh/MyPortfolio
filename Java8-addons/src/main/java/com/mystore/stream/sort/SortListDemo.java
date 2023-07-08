package com.mystore.stream.sort;

import com.mystore.stream.api.example.DataBase;
import com.mystore.stream.api.example.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

  /*      Collections.sort(list);//Assending
        Collections.reverse(list);
        System.out.println(list);

        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.println(t));*/

        List<Employee> employees = DataBase.getEmployees();

      /*  Collections.sort(employees, (o1, o2) -> (int)  (o1.getSalary() - o2.getSalary()));
        System.out.println(employees);
*/
        //employees.stream().sorted( (o1, o2) -> (int)  (o1.getSalary() - o2.getSalary())).forEach(System.out::println        );

        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println        );
    }
}
