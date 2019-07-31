package com.lambda.test;

import java.util.Arrays;
import java.util.Comparator;

public class Demo06Comparator {
    private static Comparator<String> newComparator() {
        return (a,b) -> b.length() - a.length();
    }

    public static void main(String[] args) {
        String[] array = { "abc" , "ab" , "abcd" };
        System.out.println(Arrays.toString(array));
        Arrays.sort(array,newComparator());
        System.out.println(Arrays.toString(array));
    }
}
