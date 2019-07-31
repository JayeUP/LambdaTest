package com.stream.test;

import java.util.stream.Stream;

/**
 * 逐一处理：forEach
 */
public class Demo12StreamForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张无忌", "张三丰", "周芷若");
        stream.forEach(name -> System.out.println(name));
    }
}
