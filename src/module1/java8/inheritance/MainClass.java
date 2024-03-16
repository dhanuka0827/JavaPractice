package module1.java8.inheritance;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

    public static void main(String[] args) {

        /*Employee employee = new Employee("Jon");

        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("Jon"));
        *//*employees.add(new Employee("Ron"));
        employees.add(new Employee("Jon"));
        employees.add(new Employee("Jon"));*//*
        employees.add(employee);
        employees.add(employee);
        System.out.println(employees.size());*/

        Parent p1 = new Child();
        Parent p2 = new Parent();
        Child c1 = new Child();
        p1.m1();
        p2.m1();
        c1.m1();
    }

}
