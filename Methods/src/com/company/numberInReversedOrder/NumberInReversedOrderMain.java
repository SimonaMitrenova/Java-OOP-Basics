package com.company.numberInReversedOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberInReversedOrderMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        DecimalNumber num = new DecimalNumber();
        String result = num.getReversedNumber(number);
        System.out.println(result);
    }
}
