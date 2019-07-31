package com.lambda.test;

import java.util.function.Consumer;

/**
 * <h1>Consumer接口 抽象方法：accept</h1>
 * java.util.function.Consumer<T> 接口则正好与Supplier接口相反，它不是生产一个数据，而是消费一个数据，
 * 其数据类型由泛型决定
 * Consumer 接口中包含抽象方法 void accept(T t) ，意为消费一个指定泛型的数据。
 */
public class Demo09Consumer {
    private static void consumeString(Consumer<String> function) {
        function.accept("Hello");
    }

    public static void main(String[] args) {
        consumeString(s -> System.out.println(s));
    }
}
