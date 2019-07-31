package com.lambda.test;

import java.util.function.Function;

/**
 * <h1>默认方法：andThen</h1>
 * Function 接口中有一个默认的 andThen 方法，用来进行组合操作。
 */
public class Demo12FunctionAndThen {
   private static void method(Function<String,Integer> one,Function<Integer,Integer> two) {
        int num = one.andThen(two).apply("10");
       System.out.println(num + 20);
   }

    public static void main(String[] args) {
       //第一个操作是将字符串解析成为int数字，第二个操作是乘以10。两个操作通过 andThen 按照前后顺序组合到了一起
        method(str -> Integer.parseInt(str)+10, i -> i *= 10);
    }
}
