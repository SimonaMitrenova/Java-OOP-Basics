package com.company.companyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class EmployeeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, TreeSet<Employee>> departments = new HashMap<>();
        HashMap<String, Double> departmentsSalary = new HashMap<>();
        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] inputParams = reader.readLine().split("\\s+");
            String name = inputParams[0];
            double salary = Double.valueOf(inputParams[1]);
            String position = inputParams[2];
            String department = inputParams[3];
            Employee employee = new Employee(name, salary, position, department);
            if (inputParams.length > 4){
                if (isNumber(inputParams[4])){
                    employee.setAge(Integer.valueOf(inputParams[4]));
                } else{
                    employee.setEmail(inputParams[4]);
                }
            }
            if (inputParams.length > 5){
                if (isNumber(inputParams[5])){
                    employee.setAge(Integer.valueOf(inputParams[5]));
                } else{
                    employee.setEmail(inputParams[5]);
                }
            }

            if (!departments.containsKey(department)){
                departments.put(department, new TreeSet<>());
                departmentsSalary.put(department, 0.0);
            }
            departments.get(department).add(employee);
            departmentsSalary.put(department, departmentsSalary.get(department) + salary);
        }

        Map.Entry<String, TreeSet<Employee>> best = departments
                .entrySet()
                .stream()
                .sorted((d1, d2) -> Double.compare(departmentsSalary.get(d2.getKey()), departmentsSalary.get(d1.getKey())))
                .findFirst()
                .get();

        System.out.printf("Highest Average Salary: %s%n", best.getKey());
        for (Employee employee : best.getValue()) {
            System.out.println(employee);
        }
    }

    private static boolean isNumber(String argument){
        try{
            Integer.valueOf(argument);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }
}
