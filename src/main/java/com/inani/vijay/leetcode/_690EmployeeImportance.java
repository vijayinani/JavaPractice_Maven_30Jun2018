package com.inani.vijay.leetcode;

import java.util.*;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class _690EmployeeImportance {

    // [[1,5,[2,3]],[2,3,[]],[3,3,[]]]

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.importance = 5;

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.importance = 3;

        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.importance = 3;

        employee1.subordinates = new ArrayList<>();
        employee1.subordinates.add(2);
        employee1.subordinates.add(3);

        employee2.subordinates = new ArrayList<>();

        employee3.subordinates = new ArrayList<>();

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println(new _690EmployeeImportance().getImportance(employees, 1));
    }

    /*
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee e : employees) {
            employeeMap.put(e.id, e);
        }
        return evaluate(employeeMap, id);
    }

    private int evaluate(Map<Integer, Employee> employeeMap, int id) {
        Employee employee = employeeMap.get(id);
        int importance = employee.importance;
        for (int subId : employee.subordinates) {
            importance += evaluate(employeeMap, subId);
        }
        return importance;
    }

     */

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee e : employees) {
            employeeMap.put(e.id, e);
        }

        int totalImportance = 0;
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(employeeMap.get(id));

        while (!queue.isEmpty()) {
            Employee poll = queue.poll();
            totalImportance += poll.importance;
            for (int sub : poll.subordinates) {
                queue.offer(employeeMap.get(sub));
            }
        }
        return totalImportance;
    }
}
