package com.company.wildFarm.animals;

import com.company.wildFarm.foods.*;

public class Tiger extends Felime{

    public Tiger(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable){
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        this.foodEaten += food.getQuantity();
    }

    @Override
    public String makeSound() {
        return "ROAAR!!!";
    }
}
