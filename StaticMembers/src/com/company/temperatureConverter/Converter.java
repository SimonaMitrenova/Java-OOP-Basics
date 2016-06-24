package com.company.temperatureConverter;


public class Converter {
    public static double calculateCelsius(int temperature){
        return (temperature - 32) / 1.8;
    }

    public static double calculateFahrenheit(int temperature){
        return temperature * 1.8 + 32;
    }
}
