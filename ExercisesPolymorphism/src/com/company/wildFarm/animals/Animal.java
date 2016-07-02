package com.company.wildFarm.animals;

import com.company.wildFarm.interfaces.*;

public abstract class Animal implements SoundProducible, FoodEdible{
    String name;
    double weight;
    int foodEaten;

    Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.foodEaten = 0;
    }
}
