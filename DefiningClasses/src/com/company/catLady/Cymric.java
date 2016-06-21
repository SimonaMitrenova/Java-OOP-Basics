package com.company.catLady;

public class Cymric extends Cat {
    private String furLength;
    protected Cymric(String name, String furLength) {
        super(name);
        this.furLength = furLength;
    }

    @Override
    public String toString() {
        return String.format("Cymric %s %s", this.getName(), this.furLength);
    }
}
