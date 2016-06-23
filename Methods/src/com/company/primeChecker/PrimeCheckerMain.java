package com.company.primeChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeCheckerMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.valueOf(reader.readLine());
        Number first = new Number(number);
        first.setPrime(first.checkIsPrime(number));
        Number second = first.findNextPrime();
        System.out.println(String.format("%d, %s",second.getNumber(), first.isPrime()));
    }
}
