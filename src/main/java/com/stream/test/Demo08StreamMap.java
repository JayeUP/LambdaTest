package com.stream.test;

import java.util.stream.Stream;

/**
 * 映射：map
 */
public class Demo08StreamMap {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("10", "12", "18");
        // 执行终结方法forEach和count之后，好像会关闭流，无法再操作该流？
        //original.forEach(System.out::println);
        Stream<Integer> result = original.map(str -> Integer.parseInt(str));
        result.forEach(System.out::println);
    }
}
