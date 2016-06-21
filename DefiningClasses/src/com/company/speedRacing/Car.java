package com.company.speedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTraveled = 0;
    }

    public boolean move(int amountOfKm){
        if (amountOfKm * fuelCost > fuelAmount){
            return false;
        }

        distanceTraveled += amountOfKm;
        fuelAmount -= amountOfKm * fuelCost;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);
    }
}
