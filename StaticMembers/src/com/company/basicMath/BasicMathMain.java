package com.company.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMathMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] params = reader.readLine().split("\\s+");
            if (params[0].equals("End")){
                break;
            }

            String command = params[0];
            double first = Double.parseDouble(params[1]);
            double second = Double.parseDouble(params[2]);
            double result = 0.0;
            switch (command){
                case "Sum":
                    result = MathUtil.sum(first, second);
                    break;

                case "Subtract":
                    result = MathUtil.subtract(first, second);
                    break;

                case "Multiply":
                    result = MathUtil.multiply(first, second);
                    break;

                case "Divide":
                    result = MathUtil.divide(first, second);
                    break;

                case "Percentage":
                    result = MathUtil.percentage(first, second);
                    break;
            }
            System.out.printf("%.2f%n", result);
        }
    }
}
