package com.mine.advance.generics;

public class Utils {

    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) > 0) ? first : second;
    }
    public static <K, V> void print(K type, V value) {
        System.out.println(type + ": " + value);
    }
}
