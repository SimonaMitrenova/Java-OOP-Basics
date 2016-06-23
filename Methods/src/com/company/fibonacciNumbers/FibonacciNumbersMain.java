package com.company.fibonacciNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class FibonacciNumbersMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.valueOf(reader.readLine());
        int end = Integer.valueOf(reader.readLine());
        Fibonacci fibonacci = new Fibonacci();
        List<Long> result = fibonacci.getNumbersInRange(start, end);
        String output = result.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(output);
    }
}
