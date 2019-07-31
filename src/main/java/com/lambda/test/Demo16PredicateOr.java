package com.lambda.test;

import java.util.function.Predicate;

/**
 * <h1>默认方法：or</h1>
 * 与 and 的“与”类似，默认方法 or 实现逻辑关系中的“或”。
 */
public class Demo16PredicateOr {
    private static void method(Predicate<String> one, Predicate<String> two) {
        boolean isValid = one.or(two).test("Helloworld");
        System.out.println("字符串符合要求吗：" + isValid);
    }

    public static void main(String[] args) {
        // 字符串包含大写H或者包含大写W
        method(s -> s.contains("H"), s -> s.contains("W"));
    }
}
