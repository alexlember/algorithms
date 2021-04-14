package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImportanceTest {

    @Test
    public void test() {

        EmployeeImportance service = new EmployeeImportance();

        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.importance = 3;

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.importance = 3;

        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.importance = 5;
        List<Integer> employeesOf1 = new ArrayList<>();
        employeesOf1.add(employee2.id);
        employeesOf1.add(employee3.id);
        employee1.subordinates = employeesOf1;

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        int res = service.getImportance(employees, 1);
        Assertions.assertEquals(11, res);
    }

}
