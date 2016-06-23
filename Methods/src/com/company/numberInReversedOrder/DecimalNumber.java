package com.company.numberInReversedOrder;

public class DecimalNumber {
    public String getReversedNumber(String number){
        StringBuilder reversed = new StringBuilder();
        return reversed.append(number).reverse().toString();
    }
}
