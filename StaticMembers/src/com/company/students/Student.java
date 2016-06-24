package com.company.students;

class Student {

    static int id = 0;
    private String name;

    public Student(String name) {
        this.name = name;
        id++;
    }
}
