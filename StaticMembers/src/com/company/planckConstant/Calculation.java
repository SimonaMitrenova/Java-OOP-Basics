package com.company.planckConstant;

public class Calculation {
    private static final double PLANCK_CONSTANT;
    private static final double PI;

    static {
        PLANCK_CONSTANT = 6.62606896e-34;
        PI = 3.14159;
    }

    public static double getReducedPlanck(){
        return PLANCK_CONSTANT / (2 * PI);
    }
}
