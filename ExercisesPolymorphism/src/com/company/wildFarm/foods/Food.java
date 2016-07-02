package com.company.wildFarm.foods;

public abstract class Food {
    private int quantity;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
