package com.company.basicMath;

public class MathUtil {
    public static double sum(double first, double second){
        return first + second;
    }

    public static double subtract(double first, double second){
        return first - second;
    }

    public static double multiply(double first, double second){
        return first * second;
    }

    public static double divide(double first, double second){
        return first / second;
    }

    public static double percentage(double number, double percent){
        return number * (percent / 100);
    }
}
