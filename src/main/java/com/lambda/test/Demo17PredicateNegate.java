package com.lambda.test;

import java.util.function.Predicate;

/**
 * <h1>默认方法：negate</h1>
 * “与”、“或”已经了解了，剩下的“非”（取反）也会简单
 */
public class Demo17PredicateNegate {
    private static void method(Predicate<String> predicate) {
        boolean veryLong = predicate.negate().test("HelloWorld");
        System.out.println("字符串很长吗：" + veryLong);
    }

    public static void main(String[] args) {
        method(s -> s.length() < 5);
    }
}
