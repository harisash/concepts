package com.mine.oopConcepts.inheritance;

import com.mine.oopConcepts.abstration.Child;

public class InheritanceMain {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);

        System.out.println(p1.equals(p2));
    }
}
