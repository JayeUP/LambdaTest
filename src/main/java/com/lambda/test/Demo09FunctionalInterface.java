package com.lambda.test;

public class Demo09FunctionalInterface {
    // 使用自定义的函数式接口作为方法参数
    private static void doSomething(MyFunctionalInterface inter){
        inter.myMethod();
    }

    public static void main(String[] args) {
        // 调用使用函数式接口的方法
        doSomething(() -> System.out.println("Lambda执行了！ "));
    }
}
