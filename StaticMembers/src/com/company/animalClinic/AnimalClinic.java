package com.company.animalClinic;

import java.util.ArrayList;
import java.util.List;

public class AnimalClinic {
    private static int patientId;
    private static int healedAnimalsCount;
    private static int rehabilitatedAnimalsCount;
    private static List<String> healedAnimals;
    private static List<String> rehabilitateAnimals;

    static {
        patientId = 0;
        healedAnimalsCount = 0;
        rehabilitatedAnimalsCount = 0;
        healedAnimals = new ArrayList<>();
        rehabilitateAnimals = new ArrayList<>();
    }

    public static void heal(Animal animal){
        patientId++;
        healedAnimalsCount++;
        healedAnimals.add(String.format("%s %s", animal.getName(), animal.getBreed()));
        System.out.printf("Patient %d: [%s] has been healed!%n", patientId, animal);
    }
    public static void rehabilitate(Animal animal){
        patientId++;
        rehabilitatedAnimalsCount++;
        rehabilitateAnimals.add(String.format("%s %s", animal.getName(), animal.getBreed()));
        System.out.printf("Patient %d: [%s] has been rehabilitated!%n", patientId, animal);
    }

    public static int getHealedAnimalsCount() {
        return healedAnimalsCount;
    }

    public static int getRehabilitatedAnimalsCount() {
        return rehabilitatedAnimalsCount;
    }

    public static List<String> getHealedAnimals() {
        return healedAnimals;
    }

    public static List<String> getRehabilitateAnimals() {
        return rehabilitateAnimals;
    }
}
