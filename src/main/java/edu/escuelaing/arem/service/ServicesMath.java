package edu.escuelaing.arem.service;

public class ServicesMath 
{
    public static final double e = 2.7182818284590452354;
    public static Double cosMathService (String num)
    {
        Double numberDou = Double.valueOf(num);
        return Math.cos(numberDou);
    }
    public static Double expMathService (String num)
    {
        Double numberDou = Double.valueOf(num);
        return Math.pow(e, numberDou);
    }
}