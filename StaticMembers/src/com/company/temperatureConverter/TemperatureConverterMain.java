package com.company.temperatureConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverterMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] command = reader.readLine().split("\\s+");
            if (command[0].equals("End")){
                break;
            }
            int temperature = Integer.parseInt(command[0]);
            String type = command[1];
            if (type.equals("Celsius")){
                double result = Converter.calculateFahrenheit(temperature);
                System.out.printf("%.2f Fahrenheit%n", result);
            } else {
                double result = Converter.calculateCelsius(temperature);
                System.out.printf("%.2f Celsius%n", result);
            }
        }
    }
}
