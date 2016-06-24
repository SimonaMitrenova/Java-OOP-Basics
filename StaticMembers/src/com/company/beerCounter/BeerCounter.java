package com.company.beerCounter;

public class BeerCounter {
    private static int beerInStock;
    private static int beersDrankCount;

    static {
        beerInStock = 0;
        beersDrankCount = 0;
    }

    public static int getBeerInStock() {
        return beerInStock;
    }

    public static int getBeersDrankCount() {
        return beersDrankCount;
    }

    public static void buyBeer(int bottlesCount){
        beerInStock += bottlesCount;
    }

    public static void drinkBeer(int bottlesCount){
        beersDrankCount += bottlesCount;
        beerInStock -= bottlesCount;
    }
}
