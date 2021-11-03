package com.mine.oopConcepts.abstration;

public class AbstractMain {

    public static void main(String[] args) {
        int operatorId = 1;
        String response = null;

        if (operatorId == 1) {
            Charging jazzCharging = new JazzCharging();
            response = jazzCharging.charge();
        } else if (operatorId == 2) {
            Charging zongCharging = new ZongCharging();
            response = zongCharging.charge();
        }
        System.out.println(response);
    }
}
