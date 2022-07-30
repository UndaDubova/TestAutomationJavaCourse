package com.company.module10;

public class Calculator{

    public double add(double x, double y) {
        return x + y;
    }

    public double add(double x, double y, double z) {
        return x + y + z;
    }

    public double substract(double x, double y) {
        return x - y;
    }

    public double divide (double x, double y) {
        double result = 0;
        try {
            result = x / y;
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
        return result;
    }

    public double multiply(double a, double b) throws CustomException {
        double result = a * b;
        if (result<0) {
            throw new CustomException("Multiplying two negative numbers is forbidden in this country");
        } else {
            return result;
        }


    }
}
