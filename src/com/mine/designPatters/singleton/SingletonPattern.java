package com.mine.designPatters.singleton;

public class SingletonPattern {

    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {
        System.out.println("Constructors initialized ....");
    }

    /*
    Optimization Algorithm:
    - Check that the variable is initialized without obtaining the lock. If it is initialized, return it immediately.
    - Obtain the lock
    - Double-check whether the variable has already been initialized, if the another thread acquired the lock first, it may have
     already done the initialization. If so, return the initialized variable.
    - Otherwise, initialize and return the variable.
    */
    public static SingletonPattern getSingletonPattern() {
        SingletonPattern ref = singletonPattern;
        if (ref == null) {
            synchronized (SingletonPattern.class) {
                ref = singletonPattern;
                if(ref == null) {
                     singletonPattern = new SingletonPattern();
                }
            }
        }

        return singletonPattern;
    }
}
