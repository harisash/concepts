package com.mine;

public class TaxReport {

    private TaxCalculator calculator;

    public TaxReport (TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show () {
        var tax = calculator.calculateTax();
        System.out.println("Tax report is: " + tax);
    }
}
