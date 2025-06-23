package com.example.finanaceforecasting;



public class FinanceForecasting {

    
    public static double forecastFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return (1 + rate) * forecastFutureValue(presentValue, rate, years - 1);
        }
    }

    public static void main(String[] args) {
        double presentValue = 10000; 
        double growthRate = 0.08;    
        int years = 5;

        double futureValue = forecastFutureValue(presentValue, growthRate, years);
        System.out.printf("Predicted Future Value after %d years: ₹%.2f%n", years, futureValue);
    }
}