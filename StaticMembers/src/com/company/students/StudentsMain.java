package com.company.students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentsMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = reader.readLine();
            if (input.equals("End")) {
                break;
            }
            Student student = new Student(input);
            System.out.println(student.id);
        }

        System.out.println(Student.id);
    }
}

