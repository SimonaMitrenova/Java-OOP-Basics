package com.company.beerCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeerCounterMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String command = reader.readLine();
            if (command.equals("End")){
                break;
            }
            String[] beers = command.split("\\s+");
            int bought = Integer.parseInt(beers[0]);
            int drank = Integer.parseInt(beers[1]);
            BeerCounter.buyBeer(bought);
            BeerCounter.drinkBeer(drank);
        }

        System.out.printf("%d ", BeerCounter.getBeerInStock());
        System.out.println(BeerCounter.getBeersDrankCount());
    }
}
