package com.lambda.test;

/**
 * 证明Lambda的延迟
 */
public class Demo02LoggerLambda {
    private static void log(int level, MessageBuilder builder){
        if (level == 1) {
            System.out.println(builder.buildMessage());
        }
    }

    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "World";
        String msgC = "Java";
        //log(1, () -> msgA + msgB + msgC);
        // 在不符合级别要求的情况下，Lambda将不会执行,不会进行拼接字符串
        log(2, () -> {
            System.out.println("Lambda执行了！");
            return msgA + msgB + msgC;
        });
    }
}
