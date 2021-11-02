package com.mine.oopConcepts.inheritance;

public abstract class UIControl {
    private boolean isEnabled;

    public final void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public abstract void render ();
}
