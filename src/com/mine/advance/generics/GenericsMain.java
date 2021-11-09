package com.mine.advance.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        list.add("abc");
        list.add("def");

        var iterator = list.iterator();
        while (iterator.hasNext()) {
            var value = iterator.next();
            System.out.println(value);
        }
    }
}
