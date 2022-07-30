package com.company.module10;

import java.math.RoundingMode;
import java.text.DecimalFormat;

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
        DecimalFormat df=new DecimalFormat("#.##");
        double result = 0;
        try {
            result = x / y;
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
        df.setRoundingMode(RoundingMode.DOWN);
        result =Double.parseDouble( df.format(result));
        return result;
    }

    public double multiply(double a, double b) throws CustomException {
        DecimalFormat df=new DecimalFormat("#.##");
        double result = a * b;
        if (result==0) {
            throw new CustomException("oh no its a zero");
        }
        df.setRoundingMode(RoundingMode.DOWN);
        result =Double.parseDouble( df.format(result));
        return result;

    }
}
