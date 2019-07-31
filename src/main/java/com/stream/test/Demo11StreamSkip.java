package com.stream.test;

import java.util.stream.Stream;

/**
 * 跳过前几个：skip
 */
public class Demo11StreamSkip {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        Stream<String> result = original.skip(2);
        //result.forEach(System.out::println);
        System.out.println(result.count()); //1
    }
}
