package com.company.opinionPoll;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
        this("No name", 1);
    }

    public Person(int age) {
        this("No name", age);
    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.getName(), this.getAge());
    }


    @Override
    public int compareTo(Person other) {
        return this.getName().compareTo(other.getName());
    }
}
