package com.mine.designPatters.singleton;

public class SingletonPattern {

    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {
        System.out.println("Constructors initialized ....");
    }

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
