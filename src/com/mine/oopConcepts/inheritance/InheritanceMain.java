package com.mine.oopConcepts.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
//        UIControl[] controls = {new TextBox(), new CheckBox()};
//        for (UIControl control : controls) {
//            control.render();
//        }

        UIControl control = new TextBox();
        control.enable();
        System.out.println(control.isEnabled());
        control.render();
    }
}
