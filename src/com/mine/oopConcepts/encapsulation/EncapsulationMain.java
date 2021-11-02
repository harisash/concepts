package com.mine.oopConcepts.encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        /*int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);*/

        Employee employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setExtraHours(10);
        employee.setHourlyRate(20);

        System.out.println(employee.calculateWage());
    }

    private static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
