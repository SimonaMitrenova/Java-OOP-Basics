package com.company.catLady;

public abstract class Cat {
    private String name;

    protected Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
