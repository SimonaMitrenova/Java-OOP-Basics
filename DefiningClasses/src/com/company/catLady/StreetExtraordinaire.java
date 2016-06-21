package com.company.catLady;

public class StreetExtraordinaire extends Cat {
    private String decibelsOfMeows;

    protected StreetExtraordinaire(String name, String decibelsOfMeows) {
        super(name);
        this.decibelsOfMeows = decibelsOfMeows;
    }

    @Override
    public String toString() {
        return String.format("StreetExtraordinaire %s %s", this.getName(), this.decibelsOfMeows);
    }
}
