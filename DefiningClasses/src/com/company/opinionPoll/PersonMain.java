package com.company.opinionPoll;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Set;
import java.util.TreeSet;

public class PersonMain {

    public static void main(String[] args) throws Exception {
//        Class personClass = Person.class;
//        Field[] fields = personClass.getDeclaredFields();
//        System.out.println(fields.length);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Class personClass = Person.class;
//        Constructor emptyCtor = personClass.getDeclaredConstructor();
//        Constructor ageCtor = personClass.getDeclaredConstructor(int.class);
//        Constructor nameAgeCtor = personClass.getDeclaredConstructor(String.class, int.class);
//
//        String name = reader.readLine();
//        int age = Integer.valueOf(reader.readLine());
//        Person basePerson = (Person) emptyCtor.newInstance();
//        Person agePerson = (Person) ageCtor.newInstance(age);
//        Person nameAgePerson = (Person) nameAgeCtor.newInstance(name, age);
//
//        System.out.println(basePerson);
//        System.out.println(agePerson);
//        System.out.println(nameAgePerson);

        int n = Integer.valueOf(reader.readLine());
        Set<Person> persons = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] inputParams = reader.readLine().split("\\s+");
            String name = inputParams[0];
            int age = Integer.valueOf(inputParams[1]);
            Person person = new Person(name, age);
            persons.add(person);
        }

        persons.stream().filter(p -> p.getAge() > 30).forEach(System.out::println);
    }
}
