package com.stream.test;

import java.util.stream.Stream;

/**
 * 过滤：filter
 */
public class Demo07StreamFilter {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        Stream<String> result = original.filter(s -> s.startsWith("张"));
        result.forEach(System.out::println);
    }
}
