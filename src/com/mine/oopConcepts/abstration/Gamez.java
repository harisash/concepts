package com.mine.oopConcepts.abstration;

public abstract class Gamez {

    public abstract void register();

    public abstract void unsub();

    public abstract void logout();

    public String encode(long msisdn) {
        return "encoded msisdn:" + msisdn;
    }
}
