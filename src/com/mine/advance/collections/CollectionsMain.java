package com.mine.advance.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
