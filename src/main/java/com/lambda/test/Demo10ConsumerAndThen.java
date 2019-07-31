package com.lambda.test;

import java.util.function.Consumer;

/**
 * <h1>默认方法：andThen</h1>
 * 如果一个方法的参数和返回值全都是 Consumer 类型，那么就可以实现效果：消费数据的时候，首先做一个操作，
 * 然后再做一个操作，实现组合。而这个方法就是 Consumer 接口中的default方法 andThen 。
 */
public class Demo10ConsumerAndThen {
    private static void consumerString(Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept("Hello");
    }

    public static void main(String[] args) {
        consumerString(
            s -> System.out.println(s.toUpperCase()),
            s -> System.out.println(s.toLowerCase())
        );
    }
}
