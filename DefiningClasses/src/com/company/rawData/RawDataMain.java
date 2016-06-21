package com.company.rawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RawDataMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Car> cars = new ArrayList<>();
        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] inputArgs = reader.readLine().split("\\s+");
            String model = inputArgs[0];

            int engineSpeed = Integer.valueOf(inputArgs[1]);
            int enginePower = Integer.valueOf(inputArgs[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.valueOf(inputArgs[3]);
            String cargoType = inputArgs[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire[] tires = new Tire[4];
            for (int j = 0; j < 4; j++) {
                double tirePressure = Double.valueOf(inputArgs[5]);
                int tireAge = Integer.valueOf(inputArgs[6]);
                Tire tire = new Tire(tirePressure, tireAge);
                tires[j] = tire;
            }

            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }

        String cargoType = reader.readLine();
        switch (cargoType){
            case "fragile":
                cars.stream().filter(c -> c.getCargo().getCargoType().equals(cargoType)).filter(c -> {
                    double pressure = 0.0;
                    for (Tire tire : c.getTires()) {
                        pressure += tire.getPressure();
                    }

                    return pressure / 4 < 1;
                }).forEach(System.out::println);
                break;

            case "flamable":
                cars.stream()
                        .filter(c -> c.getCargo().getCargoType().equals(cargoType))
                        .filter(c -> c.getEngine().getEnginePower() > 250)
                        .forEach(System.out::println);
                break;
        }

    }
}
