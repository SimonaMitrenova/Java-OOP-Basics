package com.company.printPeople;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s - age: %d, occupation: %s", this.name, this.age, this.occupation);
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}
