package com.company.uniqueStudentNames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class UniqueStudentNamesMain {

    public static void main(String[] args) throws IOException {
        HashMap<String, Student> students = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String input = reader.readLine();
            if (input.equals("End")){
                break;
            }

            if (!students.containsKey(input)){
                students.put(input, new Student(input));
            }
        }

        System.out.println(students.size());
    }
}
