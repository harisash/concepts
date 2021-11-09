package com.mine.oopConcepts.abstration;

import java.text.DecimalFormat;

public class JazzCharging extends Charging {

    private static final String METHOD_NAME = "UpdateBalanceAndDate";
    private static final String ORIGIN_NODE_TYPE = "EXT";
    private static final String ORIGIN_HOST_NAME = "GNcasual";
    private static final String TRANSACTION_TYPE = "GNcasual";
    private static final String TRANSACTION_CODE = "GNcasual";
    private static final String TRANSACTION_CURRENCY = "PKR";
    private static final String EXTERNAL_DATA_1 = "GNcasual_VAS";
    private static final String EXTERNAL_DATA_2 = "GNcasual_VAS";

    @Override
    public String charge() {
        // Ready initial data for the request
        // Check if user is postpaid
        // Convert input to XML
        // Call Jazz API with XML as input
        // Convert XML to our usable array response
        // Translate array to generic Response object
        // Return => Response
        return "Jazz charging";
    }

    public void innerInJazz() {
        System.out.println("Inner in Jazz");
    }
}
