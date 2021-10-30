package com.mine.oopConcepts.inheritance;

public class TextBox extends UIControl {
    public TextBox() {
        super(true);
        System.out.println("Textbox");
    }

    public void hello() {

    }

    @Override
    public String toString() {
        return "toString() of TextBox";
    }
}
