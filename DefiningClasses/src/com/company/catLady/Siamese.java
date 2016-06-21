package com.company.catLady;

public class Siamese extends Cat{
    private String earSize;

    protected Siamese(String name, String earSize) {
        super(name);
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("Siamese %s %s", this.getName(), this.earSize);
    }
}
