package com.company.printPeople;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class PrintPeopleMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Person> people = new LinkedList<>();
        while (true) {
            String[] params = reader.readLine().trim().split("\\s+");
            if (params[0].equals("END")) {
                break;
            }

            String name = params[0];
            int age = Integer.valueOf(params[1]);
            String occupation = params[2];
            Person person = new Person(name, age, occupation);
            people.add(person);
        }

        people.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);
    }
}
