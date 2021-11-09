package com.mine.oopConcepts.abstration.interfaces;

public interface Mother {

    default void attributess() {
        System.out.println("Mother's attributes");
    }
}
