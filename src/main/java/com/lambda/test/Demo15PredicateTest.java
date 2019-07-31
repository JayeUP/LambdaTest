package com.lambda.test;

import java.util.function.Predicate;

/**
 * <h1>Predicate接口 抽象方法：test</h1>
 * 有时候我们需要对某种类型的数据进行判断，从而得到一个boolean值结果。这时可以使用
 * java.util.function.Predicate<T> 接口。
 */
public class Demo15PredicateTest {
    private static void method(Predicate<String> predicate) {
        boolean veryLong = predicate.test("HelloWorld");
        System.out.println("字符串很长吗：" + veryLong);
    }

    public static void main(String[] args) {
        // 条件判断的标准是传入的Lambda表达式逻辑，只要字符串长度大于5则认为很长
        method(s -> s.length() > 5);
    }
}
