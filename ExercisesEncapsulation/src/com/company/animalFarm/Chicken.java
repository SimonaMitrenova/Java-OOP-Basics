package com.company.animalFarm;

public class Chicken {
    private final int MIN_AGE = 0;
    private final int MAX_AGE = 15;

    private String name;
    private int age;

    Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        if (name.isEmpty() || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < this.MIN_AGE || age > this.MAX_AGE) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public double getProductPerDay() {
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if ((this.getAge() >= 0 && this.getAge() <= 3) ||
                (this.getAge() >= 8 && this.getAge() <= 11)){
            return 2;
        } else if (this.getAge() >= 4 && this.getAge() <= 7){
            return 3;
        }

        return 1;
    }
}
