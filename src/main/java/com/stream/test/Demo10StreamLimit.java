package com.stream.test;

import java.util.stream.Stream;

/**
 * 取用前几个：limit
 */
public class Demo10StreamLimit {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        Stream<String> result = original.limit(2);
        //result.forEach(System.out::println);
        System.out.println(result.count()); //2
    }
}
