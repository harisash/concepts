package com.mine.oopConcepts.encapsulation;

public class Employee {
    private int baseSalary;
    private int extraHours;
    public int hourlyRate;

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int calculateWage() {
        return getBaseSalary() + (getHourlyRate() * getExtraHours());
    }
}
