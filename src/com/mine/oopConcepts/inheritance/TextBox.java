package com.mine.oopConcepts.inheritance;

public class TextBox extends UIControl {
    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return "toString() of TextBox";
    }
}
