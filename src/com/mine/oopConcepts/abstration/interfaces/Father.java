package com.mine.oopConcepts.abstration.interfaces;

public interface Father {

     default void attributes() {
        System.out.println("Father's attributes");
    }
}
