package com.company.familyTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String firstName;
    String lastName;
    String birthdate;
    List<Person> parents;
    List<Person> children;

    public Person(String firstName, String lastName, String birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Person(String birthDate) {
        this(null, null, birthDate);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%s %s %s%n", this.firstName, this.lastName, this.birthdate));
        output.append(String.format("Parents:%n"));
        for (Person parent : parents) {
            output.append(String.format("%s %s %s%n", parent.firstName, parent.lastName, parent.birthdate));
        }
        output.append(String.format("Children:%n"));
        for (Person child : children) {
            output.append(String.format("%s %s %s%n", child.firstName, child.lastName, child.birthdate));
        }
        return output.toString();
    }
}
