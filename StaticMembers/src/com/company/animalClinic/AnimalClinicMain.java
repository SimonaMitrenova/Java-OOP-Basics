package com.company.animalClinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalClinicMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String[] inputParams = reader.readLine().split("\\s+");
            if (inputParams[0].equals("End")){
                break;
            }
            String name = inputParams[0];
            String breed = inputParams[1];
            String procedure = inputParams[2];
            Animal animal = new Animal(name, breed);
            if (procedure.equals("heal")) {
                AnimalClinic.heal(animal);
            } else {
                AnimalClinic.rehabilitate(animal);
            }
        }

        System.out.printf("Total healed animals: %d%n", AnimalClinic.getHealedAnimalsCount());
        System.out.printf("Total rehabilitated animals: %d%n", AnimalClinic.getRehabilitatedAnimalsCount());

        String type = reader.readLine();
        if (type.equals("heal")) {
            AnimalClinic.getHealedAnimals().stream().forEach(System.out::println);
        } else {
            AnimalClinic.getRehabilitateAnimals().stream().forEach(System.out::println);
        }
    }
}
