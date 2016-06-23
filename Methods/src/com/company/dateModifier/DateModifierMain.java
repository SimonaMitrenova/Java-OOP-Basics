package com.company.dateModifier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DateModifierMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = reader.readLine();
        String end = reader.readLine();
        DateModifier dm = new DateModifier();
        long result = dm.getDayDifference(start, end);
        System.out.println(Math.abs(result));
    }
}
