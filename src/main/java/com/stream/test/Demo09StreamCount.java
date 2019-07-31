package com.stream.test;

import java.util.stream.Stream;

/**
 * 统计个数：count
 */
public class Demo09StreamCount {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        Stream<String> result = original.filter(s -> s.startsWith("张"));
        System.out.println(result.count()); //2
    }
}
